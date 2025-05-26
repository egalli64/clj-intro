;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Cars, Assemble: https://exercism.org/tracks/clojure/exercises/cars-assemble/

(ns exercism.cars-assemble)

;; cars produced each hour @ speed 1
(def cars-1 221)

;; percentage of success based on speed [0 ... 10]
(def success-rate [0.0 1.0 1.0 1.0 1.0 0.9 0.9 0.9 0.9 0.8 0.77])

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed] (* (* cars-1 speed) (nth success-rate speed)))

(defn working-items
  "Calculates how many working cars are produced per minute (as int)"
  [speed] (int (/ (production-rate speed) 60)))
