;;; complement - takes a function, return a function that negates the input function

(ns brave.p2.ch4.e.e3)

;; generate a function to check if a number is odd
;; just negate the standard even? function
;; !!! just as example, use the standard odd? instead!
(def my-odd? (complement even?))

(defn -main []
    ;; plain use of complement
  (println "is 42 odd?" (my-odd? 42))
  (println "is 43 odd?" (my-odd? 43))

    ;; complement with filter
  (let [data [1 2 3 4 5 6]]
    (println "The original data:" data)
    (println "Filter for even? data:" (filter even? data))
    (println "Filter for odd? data:" (filter my-odd? data))
    (println "Same, inline:" (filter (complement even?) data)))

    ;; complement to filter out nil
  (let [data [1 nil nil 4 nil 6]]
    (println "The original data:" data)
    (println "Filter for nil? data:" (filter nil? data))
    (println "Filter for not nil? data:" (filter (complement nil?) data))))