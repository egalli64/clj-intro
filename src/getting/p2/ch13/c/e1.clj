;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; using a record as a map

;; a record
(defrecord FictionalCharacter [name appears-in author])

;; two record instances
(def elizabeth (->FictionalCharacter "Elizabeth Bennet" "Pride & Prejudice" "Austen"))
(def watson (->FictionalCharacter "John Watson" "Sign of the Four" "Doyle"))

;; access by key
(:name elizabeth)
(:appears-in watson)

;; using functions that expect a map
(count elizabeth)
(keys watson)

;; assoc to modify a value in a record
(def watson-series (assoc watson :appears-in "The Adventures of Sherlock Holmes"))
(println watson-series)

;; assoc to add an extra pair to a specific record instance
(def watson-more (assoc watson-series :address "221B Baker Street"))
(println watson-more)
