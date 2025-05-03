;; Problem 35, Local bindings
;; https://4clojure.oxal.org/#/problem/35
;; (= __ (let [x 5] (+ 2 x)))
;; (= __ (let [x 3, y 10] (- y x)))
;; (= __ (let [x 21] (let [y 3] (/ x y))))

;; my solution
(def x 7)

(print "Is the problem solved? ")
(and (= x (let [x 5] (+ 2 x))) (= x (let [x 3, y 10] (- y x))) (= x (let [x 21] (let [y 3] (/ x y)))))