;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (fn [param-list] body) - base form, anonymous function
;; (fn name [param-list] body) - named function
;; (fn name ([param-list] body) ... ) - arity-based function overloading
;; #(func arg ...) literal anonymous function

;; define an anonymous function returning a value and invoke it
((fn [] 42))
;; the literal syntax requires a valid form
(#(println))
(#(identity %) 42)

;; the function definition could include a name - useful for recursion
((fn f [] 42))

;; a function is a value, it could be bound to a symbol - the var can be invoked
(def f2 (fn [x] x))
(f2 42)

(def f3 #(identity %))
(f3 42)

;; a function with 2+ parameters
;; the extra arguments are placed in the list after the ampersand
(def f4 (fn [a b & more]
          (str a ", " b ", and ... " more)))

;; no extra arguments, more is nil
(f4 1 2)
;; single item in more
(f4 1 2 3)
;; size of more is two
(f4 1 2 3 4)

;; a multi-arity function
(def f5 (fn ([a] (str "One arg: " a))
          ([a b] (str "Two args: " a ", " b))))

(f5 "Bob")
(f5 "Bob" "Tom")
