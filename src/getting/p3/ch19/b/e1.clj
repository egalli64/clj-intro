;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; read

;; run read in the REPL to pass data to be read from Clojure
;; read and eval

(def a-data-structure '(+ 2 2))

;; eval executes the passed data
(eval a-data-structure)

;; a var containing a list that could be interpreted as a Clojure defn
(def some-data
  '(defn print-greeting [preferred-customer] (if preferred-customer (println "Welcome back!"))))

;; eval actually define the function print-greeting
(eval some-data)

;; so now we can run it!
(print-greeting true)

;; a value evaluates to itself
(eval 55)
(eval :hello)
(eval "hello")

;; a symbol evaluates to its associated value
(def title "For Whom the Bell Tolls")
(def the-symbol 'title)
(eval the-symbol)

;; a list is evaluated as a function call
(eval '(count title))

;; putting bricks together ...
(def fn-name 'print-greeting)
(def args (vector 'preferred-customer))
(def the-println (list 'println "Welcome back!"))
(def body (list 'if 'preferred-customer the-println))
(eval (list 'defn fn-name args body))
(eval (list 'print-greeting true))
