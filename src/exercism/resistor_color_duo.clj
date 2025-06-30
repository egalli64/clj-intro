;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Resistor Color Duo: https://exercism.org/tracks/clojure/exercises/resistor-color-duo/
(ns exercism.resistor-color-duo)

(defn resistor-value "Returns the resistor value based on the given colors"
  [colors]
  (let [color-map {"black" 0, "brown" 1, "red" 2, "orange" 3, "yellow" 4,
                   "green" 5, "blue" 6, "violet" 7, "grey" 8, "white" 9}]
    (+ (* 10 (color-map (first colors))) (color-map (second colors)))))