;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (def f [param-list] body)

;; define a function returning a value - then invoke it
(defn f [] 42)
(f)

;; define a function that return the passed value
(defn g [x] x)
(g 21)

;; define a function with an associated doc-string
(defn h "a simple function" [] 0)
(h)
