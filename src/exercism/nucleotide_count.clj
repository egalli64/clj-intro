;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Nucleotide Count: https://exercism.org/tracks/clojure/exercises/nucleotide-count/
(ns exercism.nucleotide-count)

(def nucleotides #{\A \C \G \T})

(defn count-of-nucleotide-in-strand [nucleotide strand]
  (when-not (nucleotides nucleotide) (throw (IllegalArgumentException. "Bad nucleotide")))
  (count (filter #(= % nucleotide) strand)))

(defn nucleotide-counts [strand]
  (when (not-every? nucleotides strand) (throw (IllegalArgumentException. "Bad nucleotide in strand")))
  (zipmap nucleotides (map (fn [nuc] (count (filter #(= % nuc) strand))) nucleotides)))
