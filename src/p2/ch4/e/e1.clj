;;; apply takes a function and a seq of arguments, then applies the function to those arguments
;;
;; (apply f arg ... args-seq) - accepts any number of scalars but just one seq, in last position

(ns p2.ch4.e.e1)

(defn -main []
    ;; max on scalars
    (println "max on scalar values:" (max 0 1 2))
    ;; max on seq
    (let [data [0 1 2]]
        (println "max on a seq:" (max data))
        (println "apply max to a seq:" (apply max data))
        (println "apply max to scalars and a seq:" (apply max 42 -2 data))
    )

    ;; str on scalar values
    (println "str on scalar values:" (str "a" "b" "c"))

    ;; str on seq
    (let [data ["a" "b" "c"]]
        (println "str on a seq:" (str data))
        (println "apply str to a seq:" (apply str data))
        (println "apply max to scalars and a seq:" (apply str "x" "y" data))
    )
)
