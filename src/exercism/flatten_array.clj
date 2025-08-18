;;;; clj-intro - Introduction to Clojure
;;;; https://github.com/egalli64/clj-intro
;;;;
;;;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;;;
;;;; Flatten Array: https://exercism.org/tracks/clojure/exercises/flatten-array/
(ns exercism.flatten-array
  (:refer-clojure :rename {flatten core-flatten}))

(defn flatten "Flattens the given sequential collection. Nil values are excluded from the result." [coll]
  (remove nil? (core-flatten coll)))
