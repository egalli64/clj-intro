;; Problem 7, conj on vectors
;; https://4clojure.oxal.org/#/problem/7
;; (= __ (conj [1 2 3] 4))
;; (= __ (conj [1 2] 3 4))

;; thinking ...
(println "The factory conj on vector generates a new vector")
(println "New element at the end:" (conj [:a :b :c] :x))
(println "vector type:" (type []))

;; my solution
(def solution [1 2 3 4])

(print "Is the problem solved? ")
(= solution (conj [1 2 3] 4))
