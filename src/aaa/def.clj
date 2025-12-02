;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (def symbol value)
;; place a symbol in the current namespace

;; define an unbound var - if it is already defined, nothing really happens
(def x)
(println x)

;; the var y is bound to the value 42 in the current namespace
(def y 42)
(println y)

;; a doc string associated to a var
(def my-str "My string variable" "hello")
(println my-str)
