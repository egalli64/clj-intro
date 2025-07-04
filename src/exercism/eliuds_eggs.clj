;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Eliud's Eggs: https://exercism.org/tracks/clojure/exercises/eliuds-eggs/
(ns exercism.eliuds-eggs)

(defn egg-count "Returns the number of 1 bits in the binary representation of the given number."
  [number]
  (loop [x number, count 0]
    (if (zero? x)
      count
      (recur (quot x 2) (if (odd? x) (inc count) count))))
  )

(defn egg-count-bit "Same, using bit functions"
  [number]
  (loop [x number, count 0]
    (if (zero? x)
      count
      (recur (bit-shift-right x 1)
             (if (= 1 (bit-and x 1)) (inc count) count))))
  )
