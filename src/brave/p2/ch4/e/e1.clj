;;; apply takes a function and a seq of arguments, then applies the function to those arguments
;;
;; (apply f arg ... args-seq) - accepts any number of scalars but just one seq, in last position

(ns brave.p2.ch4.e.e1)

(defn -main []
    ;; max is a variadic function, it operates on scalars
    (println "max on scalar values:" (max 0 1 2))
    ;; max on seq
    (let [data [0 1 2]]
        ;; max won't dig into a passed sequence
        ;; (println "max on a seq sees the seq as a value:" (max data))
        ;; use apply to splat the collection for max
        (println "apply max to a seq:" (apply max data))
        ;; apply can mix scalars and a seq at the end
        (println "apply max to scalars and a seq:" (apply max 42 -2 data))
    )

    ;; str on scalar values
    (println "str on scalar values:" (str "a" "b" "c"))

    ;; str on seq
    (let [data ["a" "b" "c"]]
        ;; str won't dig into a passed sequence
        (println "str on a seq:" (str data))
        ;; use apply to splat the collection for str
        (println "apply str to a seq:" (apply str data))
        ;; apply with scalars and a seq
        (println "apply max to scalars and a seq:" (apply str "x" "y" data))
    )
)
