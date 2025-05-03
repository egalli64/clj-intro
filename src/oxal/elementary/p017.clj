;; Problem 17, map
;; https://4clojure.oxal.org/#/problem/17
;; (= __ (map #(+ % 5) '(1 2 3)))

;; thinking ...
(println "Mapping by standard function:" (map inc [1 2 3]))
(println "Mapping by anon function:" (map #(+ % 2) '(1 2 3)))

;; my solution
(def solution [6 7 8])

(print "Is the problem solved? ")
(= solution (map #(+ % 5) '(1 2 3)))
