;;; lists
(ns p2.ch7.c.e3)

(defn -main []
    ;; empty list
    (println "Empty list is evalued to itself:" ())

    ;; function call
    (println "Non-empty is evalued as a call to its first element:"(+ 1 2))
    (println "Nested function call:" (+ 1 (+ 2 3)))

    ;; special forms: if
    (println "'if' is a special form:" (if true 1 2))

    ;; special form: quote
    (println "Quote (shortcut):" '(a b c))
    (println "Quote (explicit):" (quote (a b c)))
)