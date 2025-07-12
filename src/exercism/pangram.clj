;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Pangram: https://exercism.org/tracks/clojure/exercises/pangram/
(ns exercism.pangram
  (:require [clojure.string :as str]))

;; assuming just English letters are passed in
(defn pangram? "Returns true if the given string is a pangram; otherwise, returns false"
  [s] (= 26 (->> s (str/lower-case) (filter ^[char] Character/isLetter) (set) (count))))
