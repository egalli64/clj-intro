;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; High Scores: https://exercism.org/tracks/clojure/exercises/high-scores/
(ns exercism.high-scores)

(defn scores
  "Returns all scores"
  [scores] scores)

(defn latest
  "Returns the latest score"
  [scores] (last scores))

(defn personal-best
  "Returns the top (highest) score"
  [scores] (apply max scores))

(defn personal-top-three
  "Returns the top three scores"
  [scores] (take 3 (sort > scores)))
