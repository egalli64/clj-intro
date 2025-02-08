;;; how to call a function
;;
;; open parenthesis, operator/function, operands/arguments, close parenthesis

(ns p2.ch3.c.e1)

(defn -main []
    ;; some confusing way of using functions
    (println "The plus operator as a string:" (or + -))
    (println "Adding up values (or):" ((or + -) 1 2 3))
    (println "Adding up values (and):" ((and (= 1 1) +) 1 2 3))
    (println "Adding up values (first):" ((first [+ 0]) 1 2 3))

    ;; this is an error, 1 is not a function
    ; (1 2 3 4)

    ;; _inc function_ returns its argument increased by 1
    (println "Increasing 1.1 ..." (inc 1.1))

    ;; _map function_ takes as first argument a function
    (println "Mapping a collection returns a list ..." (map inc [1 2 3]))
)