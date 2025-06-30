;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Hamming: https://exercism.org/tracks/clojure/exercises/hamming/
(ns exercism.hamming)

;; 1. as required, throws if the strings have different item count
;; 2. pipeline on the boolean seq with true where char are same in both strings
;;    keep the different char
;;    count them
(defn distance "Returns the hamming distance between two DNA strands."
  [strand1 strand2]
  (when (not= (count strand1) (count strand2))
    (throw (IllegalArgumentException. "strands must be of equal length")))

  (->> (map = strand1 strand2)
       (filter false?)
       count))
