;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; reader level quote: ' (quote) ` (quasi-quote) ~ (unquote) ~@ (unquote-splicing)

;;
;; _'_ is expanded by the reader to the basic special form _quote_
;; _quote_ prevents the evaluation of the following form

;; single quote ' is the shortcut for quote
(= '(1 2 3) (quote (1 2 3)))

;; without quote, the evaluator would try to cast 1 to a function
(quote (1 2 3))
;; ClassCastException: Long to IFn
;; (1 2 3)

;;
;; _`_ is expanded by the reader in a construct (compiler internal detail) of the compiler
;; that construct is handled in a special way at compile time
;; quasi-quote is similar to quote, but:
;; - symbols inside a quasi-quote are automatically namespace-qualified (if not unquoted)
;; - it supports unquote _~_ and unquote-splicing _~@_
(println "quote:" 'map "... vs quasi-quote:" `map)
(let [x 42]
  (println "plain quasi-quote:" `(a b x c) "... vs using unquote:" `(a b ~x c)))

;;
;; inside a quasi-quote _~_ unquotes, evaluates an expression instead of keeping it literal
;;                      _~@_ unquotes and splices
(let [xs [2 3]]
  (println "quasi-quote and unquote" `(1 ~xs 4) "... vs unquote-splicing" `(1 ~@xs 4)))

;;
;; unquoting is commonly used in macros
(defmacro my-list [x]
  `(list 1 ~x ~@(range 3)))

(my-list :a)
