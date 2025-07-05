;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Word Count: https://exercism.org/tracks/clojure/exercises/word-count/
(ns exercism.word-count
  (:require [clojure.string :as str]))

(defn- clean-word [word]
  (-> word
      (clojure.string/replace #"^'+" "")
      (clojure.string/replace #"'+$" "")))

(defn word-count
  "Counts how many times each word occurs in the given string"
  [s]
  (->> s
       (str/lower-case)
       (re-seq #"[a-z0-9']+")
       (map clean-word)
       (remove empty?)
       (frequencies)))
