;;; how to invoke a callable
;;
;; open parenthesis, operator/function, operands/arguments, close parenthesis

(ns brave.p2.ch3.c.e1)

(defn -main []
    ;; some confusing way of using functions

    ;; or returns the first truthy argument
    (println "The plus operator as a string:" (or + -))
    (println "The plus symbol name:" (or '+ '-))

    ;; or returns the + operator, that is applied to the following integers
    (println "Adding up values (+ returned by or):" ((or + -) 1 2 3))

    ;; and returns its last truthy argument (or the first falsey)
    ;; here it returns +, that is applied to the following integers
    (println "Adding up values (and):" ((and (= 1 1) +) 1 2 3))

    ;; first returns its first argument, ...
    (println "Adding up values (first):" ((first [+ 0]) 1 2 3))

    ;; this is an error, 1 is not a function
    ; (1 2 3 4)

    ;; _inc function_ returns its argument increased by 1
    (println "Increasing 1.1 ..." (inc 1.1)) ;2.1

    ;; _map function_ takes as first argument a function
    (println "Mapping a collection returns a list ..." (map inc [1 2 3]))
)
