;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; interleave, interpose

(def titles ["Jaws" "2001" "Dracula"])
(def authors '("Benchley" "Clarke" "Stoker"))
(def years [1974 1968 1897])

;; merges the seq's in a single one, alternating elements from the different ones
(interleave titles authors years)

;; the shortest one rules
(interleave (range) titles)
;; no-op
(interleave titles)
;; empty seq
(interleave)

;; generate a new seq with the separator repeated between the elements of the collection
(interpose "and" authors)
