;;; numbers and strings
(ns p2.ch3.b.e1)


(defn -main []
    ;; numbers
    (println "An integer, a float, a ratio:" 42 3.14 7/8)
    ;; string
    (println "A string is a \"string\", if you know what I mean.")

    (def head "[[[")
    (def tail "]]]")
    ;; concatenate string by str
    (println "Concatenate by str:" (str head "hello world!" tail))
)
