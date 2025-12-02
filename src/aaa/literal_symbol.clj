;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; symbol - immutable identifier that refers to something

;; here, 1 and 2 are literals, while + is a symbol
;; + is resolved at runtime, referring to the function clojure.core/+
(+ 1 2)

;; to create a symbol, prefix its name by quote, to prevent its evaluation
(println (type 'x))
(println 'x)

;; or use the constructor function symbol
(println (type (symbol "x")))
;; sy is a symbol referring to the symbol 'x
(let [sy (symbol "x")]
  (println sy)
  (println (type sy)))

;; a symbol is implicitly placed in the current namespace
(def x 42)
