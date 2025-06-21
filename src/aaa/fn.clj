;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (fn [param-list] body)

;; define an anonymous function returning a value and invoke it
((fn [] 42))

;; the function definition could include a name - useful for recursion
((fn f [] 42))

;; a function is a value, it could be bound to a symbol - the var can be invoked
(def g (fn [] 42))
(g)

;; a function with 2+ parameters
;; the extra arguments are placed in the list after the ampersand
(def h (fn [a b & more]
         (str a ", " b ", and ... " more)))

;; no extra arguments, more is nil
(h 1 2)
;; single item in more
(h 1 2 3)
;; size of more is two
(h 1 2 3 4)
