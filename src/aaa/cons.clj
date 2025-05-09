;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (cons value sequence)

; construct a new seq prepending a new element to the passed one
(cons 1 [2 3 4])                                            ; (1 2 3 4)
; pass nil to create a new list containing just the passed value
(cons 1 nil)                                                ; (1)
