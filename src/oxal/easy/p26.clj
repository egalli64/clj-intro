;; Problem 26, Fibonacci Sequence
;; https://4clojure.oxal.org/#/problem/26
;; (= (__ 3) '(1 1 2))
;; (= (__ 6) '(1 1 2 3 5 8))
;; (= (__ 8) '(1 1 2 3 5 8 13 21))

;; thinking ...
(defn fib [n]
    (loop [a 1, b 1, xs [] i n]
    (if (zero? i)
        xs
        (recur b (+ a b) (conj xs a) (dec i))
    ))
)

(println "Fibonacci by loop-recur:" (fib 8))

;; my solution
(def solution #(loop [a 1, b 1, xs [], i %]
    (if (zero? i)
        xs
        (recur b (+ a b) (conj xs a) (dec i))
    )
))

(print "Is the problem solved? ")
(= (solution 3) '(1 1 2))
