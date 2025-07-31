;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Acronym: https://exercism.org/tracks/clojure/exercises/acronym/
(ns exercism.acronym
  (:require [clojure.string :as str]))

(defn acronym "Converts phrase to its acronym." [phrase]
  (->> (str/split phrase #"[\s-_]")
       (keep first)
       (apply str)
       (str/upper-case)))
