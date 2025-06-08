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
