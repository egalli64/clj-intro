;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (let [symbol value] expression)

;; define a local scope with an unused local binding
(let [_ 42])

;; the local binding x is used in the local scope
(let [x 42]
  (println x))

;; two local bindings, both ones used in the local scope
(let [x 42, y x]
  (println x y))
