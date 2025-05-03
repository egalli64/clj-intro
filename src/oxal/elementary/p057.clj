;; Problem 57, Simple Recursion
;; https://4clojure.oxal.org/#/problem/57
;; (= __ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))

;; thinking ...
;; the foo function is immediately executed passing 5
;; recursion ends when x is not anymore greater than zero, returning nil
;; it conj recursively on the decreased input value with x
;; if 0 (or less) is passed, no recursion starts, and it returns nil
;; if 1 is passed, the conj is on the value returned by foo invoked on nil and 1
;; remembering that nil is considered like an empty seq, we get a seq containing 1
(println (conj nil 1))
;; if 2+ is passed, conj is applied recursively con the seq (so, to the left)
(println ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))

;; my solution
(def solution '(5 4 3 2 1))

(print "Is the problem solved? ")
(= solution ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))
