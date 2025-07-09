;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Anagram: https://exercism.org/tracks/clojure/exercises/anagram/
(ns exercism.anagram
  (:require [clojure.string :as str]))

(defn anagrams-for [word prospect-list]
  (let [target (str/lower-case word), sorted-target (sort target)]
    (filter #(and (not= target (str/lower-case %)) (= sorted-target (sort (str/lower-case %)))) prospect-list)))
