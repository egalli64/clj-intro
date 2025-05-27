;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; a macro that prints the passed expression, then generates an expression that is evaluated

;; the argument "something" is not evaluated when the macro is expanded
(defmacro print-it [something]
  ;; this expression is executed at compile time
  (println "The parameter is:" something)
  ;; the macro returns this form, that is going to be executed at runtime
  (list 'println "Something is" something))

(print-it (+ 10 20))
