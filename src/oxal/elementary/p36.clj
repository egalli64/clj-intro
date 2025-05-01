;; Problem 36, Let it Be
;; https://4clojure.oxal.org/#/problem/36
;; (= 10 (let __ (+ x y)))
;; (= 4 (let __ (+ y z)))
;; (= 1 (let __ z))

;; thinking ...

;; z must be 1
(= 1 (let [z 1] z))
;; so y must be 3
(= 4 (let [y 3 z 1] (+ y z)))
;; and x 7
(= 10 (let [x 7 y 3] (+ x y)))

;; my solution
(let [x 7 y 3 z 1]
  (println x y z))

(print "Is the problem solved? ")
(and (= 10 (let [x 7 y 3] (+ x y))), (= 4 (let [y 3 z 1] (+ y z))), (= 1 (let [z 1] z)))