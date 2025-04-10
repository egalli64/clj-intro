;; Problem 17, map
;; https://4clojure.oxal.org/#/problem/17
;; (= __ (map #(+ % 5) '(1 2 3))) : [6 7 8]

;; elaborating on the theme
(println "Mapping by standard function:" (map inc [1 2 3]))
(println "Mapping by anon function:" (map #(+ % 2) '(1 2 3)))

(print "Is the actual problem solved? ")
(= [6 7 8] (map #(+ % 5) '(1 2 3)))
