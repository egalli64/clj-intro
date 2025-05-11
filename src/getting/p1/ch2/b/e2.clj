;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; vector: count, first, rest, nth

;; a vector of strings
(def novels ["Emma" "Coma" "War and Peace"])

;; number of items in the collection
(count novels)

;; first item in the collection
(first novels)

;; other beside the first item - return as a sequence
(rest novels)

;; discard the first two items
(rest (rest novels))

;; they both lead to an empty sequence
(rest ["Ready Player One"])
(rest [])

;; nth, and using the vector var as a function to get the same result
;; first item has index 0, so nth xs 1 means the second item of xs
(nth novels 1)
(novels 1)
