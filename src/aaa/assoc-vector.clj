;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (assoc vector index value)
;; upsert: update if index is present, insert in last position if index = (count vector)

(assoc [0 1 2] 2 42)                                        ; [0 1 42]
(assoc [0 1 2] 3 42)                                        ; [0 1 2 42]
(assoc [0 1 2] 2 42, 3 13)                                  ; [0 1 42 13]
;(assoc [0 1 2] 4 42)                                        ; IndexOutOfBoundsException