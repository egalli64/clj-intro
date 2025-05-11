;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; list literal syntax, list function

;; a vector of four integers - quote is required to let Clojure know not to execute the content
(println '(1 2 3 4))

;; mixing different types
(println '(1 "two" 3.0 false))

;; a list of lists - no quote in the inner lists!
(println '((1 nil) (true 3) ("four" 5) (42)))

;; an empty list does not require a quote (but it does not harm)
(println '() ())

;; function list
(println (list 1 2 3 "four" 5 "six"))
