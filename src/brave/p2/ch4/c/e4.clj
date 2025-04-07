;;; a custom function generating a lazy seq

(ns brave.p2.ch4.c.e4)

;; overloaded function to generate a lazy seq of numbers
(defn step-by-2
    ;; zero arity overload, calls the other overload with 0 as argument
    ([] (step-by-2 0))
    ;; one arity overload
    ([n] (
        ;; cons put n in the first position of the generated sequence
        cons n (
            ;; let the seq be lazy, or we'll have a stack overflow due to recursion
            lazy-seq (
                ;; recursively call the function on n increased by 2
                step-by-2 (+ n 2)
        ))
    ))
)

(defn -main []
    (println "take 5 from 0:" (take 5 (step-by-2)))
    (println "take 5 from 7:" (take 5 (step-by-2 7)))
)
