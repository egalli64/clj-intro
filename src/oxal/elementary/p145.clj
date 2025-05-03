;; Problem 145, For the win
;; https://4clojure.oxal.org/#/problem/145
;; (= __ (for [x (range 40) :when (= 1 (rem x 4))] x))
;; (= __ (for [x (iterate #(+ 4 %) 0) :let [z (inc x)] :while (< z 40)] z))
;; (= __ (for [[x y] (partition 2 (range 20))] (+ x y)))

;; thinking ...
;; (a) range 40, filter the values have 1 as modulo 4, produce each value
(for [x (range 40) :when (= 1 (rem x 4))] x)
;; (b) iterate from 0 adding 4, increase the value (bound locally), go on looping until limit, produce each value
(for [x (iterate #(+ 4 %) 0) :let [z (inc x)] :while (< z 40)] z)
;; (c) range 20, partitioned 2, each partition is destructured, produce the sum of them
(for [[x y] (partition 2 (range 20))] (+ x y))

;; my solution
(def solution (range 1 40 4))

(print "Is the problem solved? ")
(= solution (for [x (range 40) :when (= 1 (rem x 4))] x)
   (for [x (iterate #(+ 4 %) 0) :let [z (inc x)] :while (< z 40)] z)
   (for [[x y] (partition 2 (range 20))] (+ x y)))
