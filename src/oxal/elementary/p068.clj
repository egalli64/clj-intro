;; Problem 68, Recurring Theme
;; https://4clojure.oxal.org/#/problem/68
;; (= __ (loop [x 5 result []] (if (> x 0) (recur (dec x) (conj result (+ 2 x))) result)))

;; thinking ...
;; loop on a vector, conj it (so, append to the right) the looping value increase by two
;; recur on the decreased looping value, that starts with five
;; base case is on x equals 0 (or negative), returning the vector
(println (loop [x 5 result []] (if (> x 0) (recur (dec x) (conj result (+ 2 x))) result)))

;; my solution:
(def solution [7 6 5 4 3])

(print "Is the problem solved? ")
(= solution (loop [x 5 result []] (if (> x 0) (recur (dec x) (conj result (+ 2 x))) result)))
