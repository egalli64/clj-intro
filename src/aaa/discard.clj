;;;; clj-intro - Introduction to Clojure
;;;; https://github.com/egalli64/clj-intro
;;;; Discard reader macro: the form following #_ is ignored

;; the multiply form is ignored
(= 5 (+ 1 #_(* 2 3) 4))

;; same as using a comment, but a comment is for human,
(= 5 (+ 1
        ; _(* 2 3)
        4))
;; could be applied to any valid Clojure expression
(= [1 2 4] [1 2 #_3 4])
