;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Sum of Multiples: https://exercism.org/tracks/clojure/exercises/sum-of-multiples/
(ns exercism.sum-of-multiples)

(defn sum-of-multiples "Calculate the sum of multiples" [factors limit]
  (->> factors
       (reduce (fn [acc n] (into acc (range n limit n))) #{})
       (apply +)))
