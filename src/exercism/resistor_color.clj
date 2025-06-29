;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Resistor Color: https://exercism.org/tracks/clojure/exercises/resistor-color/
(ns exercism.resistor-color)

(def colors ["black" "brown" "red" "orange" "yellow" "green" "blue" "violet" "grey" "white"])

(defn color-code "Returns the numerical value associated with the given color"
  [color] (.indexOf colors color))
