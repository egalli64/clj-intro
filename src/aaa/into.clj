;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (into to from)

;; no-args, generate an empty vector
(into)

;; single arg, identity
(into #{1 2 3})
(into 42)

;; two args, items "from" go into "to", by conj, keeping the "to" type
(into [1 2 3] '(4 5))
(into '(3 4 5) [2 1])
