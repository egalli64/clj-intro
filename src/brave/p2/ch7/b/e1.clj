;;; read-string: convert a string to Clojure form
(ns brave.p2.ch7.b.e1)

(defn -main []
    ;; read a string, generate a list
    (let [s "(+ 1 2)" ls (read-string s)]
        (println "s type:" (type s))
        (println "ls type:" (type ls))
    )

    ;; convert a string to form, than evaluate it
    (println "Evaluate:" (eval (read-string "(+ 1 2)")))
)
