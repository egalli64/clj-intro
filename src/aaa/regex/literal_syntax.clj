;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Regular expression pattern literal - actually, java.util.regex.Pattern

;; Literal syntax - here the pattern is a plain string
(let [pattern #"world"]
  (println (type pattern))
  (re-find pattern "hello world"))

;; Often used directly in a regex function
(re-find #"word" "hello world")
