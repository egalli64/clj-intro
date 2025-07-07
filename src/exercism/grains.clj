;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Grains: https://exercism.org/tracks/clojure/exercises/grains/
(ns exercism.grains)

;; on square n there are 2^(n-1) grains
(defn square "Returns the number of grains on the n-th chessboard square."
  [n] (reduce * (repeat (dec n) 2N)))

;; instead of adding up the grains square by square, just decrease by 1 the number of grains on the next square
(defn total "Returns the total number of grains on the chessboard."
  [] (dec (square 65)))
