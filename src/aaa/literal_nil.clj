;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Nil

;; the only instance of the Nil type (type of nil is nil)
(type nil)

;; in boolean context nil is falsy (it's the only falsy value besides false)
(if nil "truthy" "falsy")

;; in sequence context is "empty". Invoking seq on an empty seq gives nil
(seq [])

;; when returned by a function call, nil often means missing / no meaningful value
(:b {:a 1})
(first [])
(re-find #"x" "abc")
