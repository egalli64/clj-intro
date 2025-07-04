;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Difference of Squares: https://exercism.org/tracks/clojure/exercises/difference-of-squares/
(ns exercism.difference-of-squares)

;; using the Gauss's formula (Faulhaber's formula for p=1): n(n+1)/2
(defn square-of-sum "Returns the square of the sum of the numbers up to the given number"
  [n] (let [sum (/ (* n (inc n)) 2)] (* sum sum)))

;; using the Faulhaber's formula for p=2: n(n+1)(2n+1)/6
(defn sum-of-squares "Returns the sum of the squares of the numbers up to the given number"
  [n] (/ (* n (inc n) (inc (* 2 n))) 6))

(defn difference "Returns the difference between the square of the sum of numbers up to a given number and the sum of the squares of those numbers"
  [n] (- (square-of-sum n) (sum-of-squares n)))
