;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Bob: https://exercism.org/tracks/clojure/exercises/bob/

(ns exercism.bob)

(defn- yelling? [s]
  (let [letters (filter #(Character/isLetter ^char %) s)]
    (and (seq letters) (every? #(Character/isUpperCase ^char %) letters))))
(defn- question? [s] (re-matches #".*\?\s*" s))
(defn- silence? [s] (re-matches #"\s*" s))

(defn response-for [s]
  (cond
    (silence? s) "Fine. Be that way!"
    (yelling? s) (if (question? s) "Calm down, I know what I'm doing!" "Whoa, chill out!")
    (question? s) "Sure."
    :else "Whatever."))
