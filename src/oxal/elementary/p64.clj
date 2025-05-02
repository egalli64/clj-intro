;; Problem 64, Intro to Reduce
;; https://4clojure.oxal.org/#/problem/64
;; (= 15 (reduce __ [1 2 3 4 5]))
;; (=  0 (reduce __ []))
;; (=  6 (reduce __ 1 [2 3]))

;; my solution: +

(print "Is the problem solved? ")
(and (= 15 (reduce + [1 2 3 4 5])) (=  0 (reduce + [])) (=  6 (reduce + 1 [2 3])))
