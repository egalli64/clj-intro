;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Scrabble Score: https://exercism.org/tracks/clojure/exercises/scrabble-score/
(ns exercism.scrabble-score
  (:require [clojure.string :as str]))

(def letter-value {\A 1, \E 1, \I 1, \O 1, \U 1, \L 1, \N 1, \R 1, \S 1, \T 1
                   \D 2, \G 2 \B 3, \C 3, \M 3, \P 3, \F 4, \H 4, \V 4, \W 4, \Y 4
                   \K 5, \J 8, \X 8, \Q 10, \Z 10})

(defn score-word "Calculate a word's scrabble score" [word]
  (let [upper-word (str/upper-case word)]
    (apply + (map letter-value upper-word))))
