;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; destructuring a parameter

;; assuming the seq has 2+ items
(defn artist-description [[novelist poet]]
  (str "The novelist is " novelist " and the poet is " poet))

;; passing a seqable with 2+ items
(artist-description '("Tom" "Bob"))

;; mixing non-destructured and destructured parameters
;; uppercase message only if shout is true
(defn improved-artist-description [shout [novelist poet]]
  (let [msg (str "Novelist is " novelist " and the poet is " poet)]
    (if shout (.toUpperCase msg) msg)))

(improved-artist-description false '("Tom" "Bob"))
(improved-artist-description true '("Tom" "Bob"))
