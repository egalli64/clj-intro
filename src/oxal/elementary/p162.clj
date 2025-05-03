;; Problem 162, Logical falsity and truth
;; https://4clojure.oxal.org/#/problem/162
;; (= __ (if-not false 1 0))
;; (= __ (if-not nil 1 0))
;; (= __ (if true 1 0))
;; (= __ (if [] 1 0))
;; (= __ (if [0] 1 0))
;; (= __ (if 0 1 0))
;; (= __ (if 1 1 0))

;; thinking ...
;; "if" checks the condition and return the following value if true, or the other one
(if true 1 0)
;; the "if-not" checks the condition and return the following value if false, or the other one
(if-not false 1 0)
;; only nil is falsey (and false)
(and (not nil) (not false))
;; all the rest is truthy
(and [] 0 [0] 1 true)

;; my solution
(def solution 1)

(print "Is the problem solved? ")
(= solution (if true 1 0))
