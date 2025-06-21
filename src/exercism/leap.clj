;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Leap: https://exercism.org/tracks/clojure/exercises/leap/
(ns exercism.leap)

(defn leap-year?
  "Determine if a year is a leap year"
  [year]
  (cond (zero? (mod year 400)) true
        (zero? (mod year 100)) false
        (zero? (mod year 4)) true
        :else false))