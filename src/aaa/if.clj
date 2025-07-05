;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (if condition value alt-value)

;; since condition is true yields the first value
(if true "It's true")
;; since condition is false yields the second value
(if false "It's true" "It's false")
;; since condition is false and there is no second value, yields nil
(if false "It's true")

;; nil is the only falsey value in Clojure (besides false)
(if nil "It's truthy" "It's falsey")
(if 0  "It's truthy" "It's falsey")
