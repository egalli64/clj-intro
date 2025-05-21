;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; defrecord, ->RecordName, map->RecordName

;; kind of a map with predefined keys
(defrecord FictionalCharacter [name appears-in author])

;; now we can create a record by the ->RecordName factory function:
(def watson (->FictionalCharacter "John Watson" "Sign of the Four" "Doyle"))
(println watson)

;; ... or by the map->RecordName factory function:
(def elizabeth (map->FictionalCharacter
                 {:name       "Elizabeth Bennet"
                  :appears-in "Pride & Prejudice"
                  :author     "Austen"}))
(println elizabeth)
