;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Darts: https://exercism.org/tracks/clojure/exercises/darts/
(ns exercism.darts)

(defn score "Calculates the score of a dart throw"
  [x y]
  (let [squared-distance (+ (* x x) (* y y))]
    (cond
      ;; center
      (<= squared-distance 1) 10
      ;; middle
      (<= squared-distance 25) 5
      ;; outer
      (<= squared-distance 100) 1
      ;; missed
      :else 0)))
