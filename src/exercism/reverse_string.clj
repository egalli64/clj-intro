;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Reverse String: https://exercism.org/tracks/clojure/exercises/reverse-string/
(ns exercism.reverse-string)

(defn reverse-string "Reverses the given string"
  [s] (apply str (reverse s)))
