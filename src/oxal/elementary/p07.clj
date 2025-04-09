;; Problem 7, conj on vectors
;; https://4clojure.oxal.org/#/problem/7
;; (= __ (conj [1 2 3] 4)) : [1 2 3 4]
;; (= __ (conj [1 2] 3 4)) : [1 2 3 4]

;; elaborating on the theme
(println "The factory conj on vector generates a new vector")
(println "New element at the end:" (conj [:a :b :c] :x))
(println "vector type:" (type []))

(print "Is the actual problem solved? ")
(= [1 2 3 4] (conj [1 2 3] 4))
