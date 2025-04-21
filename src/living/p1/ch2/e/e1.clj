;;; For more info read Living Clojure by Carin Meier
;; Data transformation: the map function

(def data [:a :b :c])
(println "original data" data)

(def underscored-string #(str "_" % "_"))
(println "convert a object to a string wrapped in underscores" (underscored-string :a))

(let [underscored-strings (map underscored-string data)] (println "mapped:" underscored-strings))
(println "map returns a lazy seq:" (class (map underscored-string data)))

;; being lazy, map could work on infinite seq!
(let [xs (map underscored-string (range))] (println (take 5 xs)))
