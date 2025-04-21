;;; For more info read Living Clojure by Carin Meier
;; Data transformation: map and side effects - doall

(def data [:a :b :c])
(println "original data" data)

;; a function with a side effect
(def underscored-string #(println (str "_" % "_")))
(print "convert a object to a string wrapped in underscores: ")
(underscored-string :a)

;; this is not making much sense since each element in data is mapped to the value returned by println, nil!
;; but think of a function that both have a side effect and return a sensible value
(let [underscoring (map underscored-string data)]
  (println "The result of mapping is a lazy list, no result until is used!")
  (println underscoring)
  (println "The side effect is intermixed with the print of the newly generated seq"))

;; the doall - map idiom
(println "Realize the lazy seq returned by map, to achieve the side effect")
(defn print-underscored-strings [xs] (doall (map #(println (str "_" % "_")) xs)))

(let [underscoring (print-underscored-strings data)]
  (println "Get the result from map")
  ;; still, in this example the result is not interesting
  (println underscoring))
