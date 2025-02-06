;;; CLJ _form_ = piece of valid code
;; a form that produce a value when evaluated is called _expression_
;; an expression could be a _literal_ or an _operation_
;; a literal is a self-evaluating expression, as the number 42, or the string "hello"
;; an operation is something that involves computation or transformation, as a function call
(ns b.e1)


(defn -main []
    ;; the operation str followed by three operands, literal strings
    (println "Concatenate strings ... " (str "'one, " "two, " "three'"))
    ;; the operation + followed by two operands, literal numbers
    (println "adding 1 and 2 gives ... " (+ 1 2))
)
