;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Strain: https://exercism.org/tracks/clojure/exercises/strain/
(ns exercism.strain)

;; reimplement filter
(defn retain "Keeps the items in coll for which (pred item) returns true."
  [pred coll] (reduce (fn [acc x] (if (pred x) (conj acc x) acc)) [] coll))

;; reimplement remove
(defn discard "Removes the items in coll for which (pred item) returns true."
  [pred coll] (reduce (fn [acc x] (if (pred x) acc (conj acc x))) [] coll))
