;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Two Fer: https://exercism.org/tracks/clojure/exercises/two-fer/
(ns exercism.two-fer)

(defn two-fer
  "Return what you will say as you give away the extra cookie"
  ([] (two-fer nil))
  ([name] (str "One for " (if (seq name) name "you") ", one for me.")))
