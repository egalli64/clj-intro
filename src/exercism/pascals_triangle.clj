;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Pascal's Triangle: https://exercism.org/tracks/clojure/exercises/pascals-triangle/
(ns exercism.pascals-triangle)

(def triangle
  (iterate (fn [row] (vec (map + (cons 0 row) (conj row 0)))) [1]))

(defn row [n] (take n triangle))

(take 1 triangle)