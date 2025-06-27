;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (+ x y & more)
;; (* x y & more)
;; (- x y & more)
;; (/ x y & more)

;; add up all the passed arguments, starting with the identity element (zero)
(+)
(+ 42)
(+ 22 20)
(+ 3 4 5 6 7 8 9)
;; see apply
(try (+ [1 2 3]) (catch ClassCastException e (println (.getMessage e))))

;; multiply all the passed arguments, starting with the identity element (one)
(*)
(* 42)
(* 6 7)
(* 1 2 3 7)

;; there is no identity element for - and /
;; (-)
;; (/)

;; subtract all the argument from the first one
;; if only a single argument is passed, negate it
(- -42)
(- 64 22)
(- 66 12 8 4)

;; divide the first argument for all the other arguments
;; if only a single argument is passed, it divides 1
(/ 42)
(/ 1 6 7)
(/ 1 2 3 7)
