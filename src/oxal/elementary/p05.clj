;; Problem 5, conj on lists
;; https://4clojure.oxal.org/#/problem/5
;; (= __ (conj '(2 3 4) 1))
;; (= __ (conj '(3 4) 2 1))

;; thinking ...
(println "The factory conj on list generates a new list")
(println "New element at the beginning:" (conj '(:a :b :c) :x))
(println "nil is considered as an empty list:" (conj nil :x))
(println "list type:" (type '(:x)))

;; my solution
(def solution '(1 2 3 4))

(print "Is the problem solved? ")
(= solution (conj '(2 3 4) 1))
