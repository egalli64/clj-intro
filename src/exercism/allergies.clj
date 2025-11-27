;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Allergies: https://exercism.org/tracks/clojure/exercises/allergies/
(ns exercism.allergies)

(def item-bit {:eggs         1
               :peanuts      2
               :shellfish    4
               :strawberries 8
               :tomatoes     16
               :chocolate    32
               :pollen       64
               :cats         128})

(defn allergic-to?
  "Returns true if the score indicates an allergy to the allergen;
  otherwise, it returns false."
  [score allergen]
  (pos? (bit-and score (item-bit allergen))))

(defn allergies "Returns all allergens associated with the score."
  [score]
  (filter #(allergic-to? score %) (keys item-bit))
  )
