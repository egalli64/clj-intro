;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Prime Factors: https://exercism.org/tracks/clojure/exercises/prime-factors/
(ns exercism.prime-factors)

(defn of "Returns the prime factors of the given number." [num]
  (loop [n num, factor 2, acc []]
    (cond
      (= n 1) acc
      (zero? (mod n factor)) (recur (/ n factor) factor (conj acc factor))
      (> (* factor factor) n) (conj acc n)
      :else (recur n (inc factor) acc))))
