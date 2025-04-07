;;; symbols
;; is it a special form?
;; or, is it a local binding (let)?
;; or, is it a global binding (def /defn)?
;; exception
(ns p2.ch7.c.e2)

(defn -main []
    ;; special form, correct in this context
    (if true :a :b)
    ;; Syntax error compiling: Too few arguments to if
    ;; (if)

    ;; local binding
    (let [x 5]
        (println "Using a local binding:" (+ x 3))
    )

    ;; def global binding
    (def x 15)
    (println "Using a var:" (+ x 3))

    (let [x 5]
        (println "Local binding shadow the var:" (+ x 3))
    )

    ;; defn global binding
    (defn exclaim [exclamation]
        ;; the parameters are function local bindings
        (str exclamation "!")
    )

    (println "Invoking a user function:" (exclaim "Hadoken"))

    ;; global functions are symbols in the Clojure core namespace
    (println "Invoking a standard function:" (map inc [1 2 3]))
)
