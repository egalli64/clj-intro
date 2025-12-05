;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Regular expression pattern literal

;; The alternation operator | (also known as "or", "pipe")

;; Could be used anywhere in a pattern
(let [pattern #"dog|cat"]
  (re-find pattern "dog"))

;; More commonly found in a group
(let [pattern #"The (dog|cat) ate my (homework|snack)"]
  (re-find pattern "The dog ate my snack"))

(let [pattern #"a(?:b|c)d"]
  (re-find pattern "abd"))
