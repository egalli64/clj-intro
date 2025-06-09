;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Elyses Destructured Enchantments: https://exercism.org/tracks/clojure/exercises/elyses-destructured-enchantments/

(ns exercism.elyses-destructured-enchantments)

(defn first-card "Returns the first card from deck without relying on index or calling first"
  [deck] (let [[first] deck] first))

(defn second-card
  "Returns the second card from deck without relying on index or calling second"
  [deck] (let [[_ second] deck] second))

(defn swap-top-two-cards
  "Returns the deck with first two items reversed."
  [deck] (let [[first second & more] deck] (into [second first] more)))

(defn discard-top-card
  "Returns a sequence containing the first card and a sequence of the remaining cards in the deck."
  [deck] (let [[first & more] deck] [first more]))

(def face-cards ["jack" "queen" "king"])

(defn insert-face-cards
  "Returns the deck with face cards from the second position on - if deck is not empty."
  [deck] (let [[first & more] deck] (if first (into [first] (concat face-cards more)) face-cards)))
