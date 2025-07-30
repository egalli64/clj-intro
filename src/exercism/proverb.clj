;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Proverb: https://exercism.org/tracks/clojure/exercises/proverb/
(ns exercism.proverb
  (:require [clojure.string :as str]))

;;
; From the provided list of words generate a proverb like:
;
; For want of a nail the shoe was lost.
; For want of a shoe the horse was lost.
; For want of a horse the rider was lost.
; For want of a rider the message was lost.
; For want of a message the battle was lost.
; For want of a battle the kingdom was lost.
; And all for the want of a nail.
(defn recite [words]
  (if (empty? words)
    ""
    (let [pairs (partition 2 1 words)
          lines (map (fn [[a b]] (format "For want of a %s the %s was lost." a b)) pairs)
          ending (format "And all for the want of a %s." (first words))]
      (if (empty? lines) ending (str (str/join "\n" lines) "\n" ending)))))
