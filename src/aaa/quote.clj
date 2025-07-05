;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (quote form) do not evaluate the following form

(quote (1 2 3))
;; single quote ' is the shortcut for quote
'(1 2 3)

;; ClassCastException - it would try to execute 1
;; (1 2 3)

(= 'a (quote a))
