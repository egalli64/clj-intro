;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Isogram: https://exercism.org/tracks/clojure/exercises/isogram/
(ns exercism.isogram
  (:require [clojure.string :as str]))

(defn isogram? "Returns true if the given string is an isogram; otherwise, returns false" [s]
  (let [filtered (filter #(^[char] Character/isLetter %) (str/lower-case s))]
    (= (count filtered) (count (distinct filtered)))))
