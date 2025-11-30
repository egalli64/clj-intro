;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Rational numbers

;;
;; rationals are Ratio objects - managed as fraction
(type 1/3)
(println 1/3)

;; division result is stored as a Ratio ...
(print (/ 4 3))
;; ... when the result is not an integer
(print (/ 4 2))
;; ... and when both operands are integers
(print (/ 4.0 3))

;; coerce a ratio to integer or real value when required
(print (long 4/3))
(print (int 4/3))
(print (double 1/3))
(print (float 1/3))

