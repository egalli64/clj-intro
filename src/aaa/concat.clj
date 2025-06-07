;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (concat left right) - generate a lazy seq

;; empty seq
(concat)

;; seq with same items
(concat #{42})

;; seq with items from both input sequences
(concat '(1 2 3) [4 5 6])

;; seq with items from each seq
(concat #{1} [2 3 4] '(5 6 7))
