;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (conj collection value)

; conjunct a new value in the most efficient way for that sequence
; preserving the collection type
(conj [1 2 3] 4)                                            ; [1 2 3 4]
(conj '(1 2 3) 0)                                           ; (0 1 2 3)
; nil is considered an empty list
(conj nil 1)                                                ; (1)

; create an empty vector
(conj)                                                      ; []

; accepts multiple arguments
(conj #{1 2 3} 4 5 6)                                       ; #{1 4 6 3 2 5}
