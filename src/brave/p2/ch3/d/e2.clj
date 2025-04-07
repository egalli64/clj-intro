;;; loop-recur: built-in mechanism for tail-recursive function
;;              compiled with tail-call optimization (TCO)
;; TCO is activated by the recur keyword
;;
;; basic syntax: (loop [bindings] body-with-recur)

(ns brave.p2.ch3.d.e2)

(defn -main []
    ;; enter the loop setting the initial value to 1
    (loop [i 1]
        (if (> i 3)
            ;; terminate
            (println "Go!")
            ;; print and recur on the increased value
            (do (print i "... ")
                ;; must be the last call in the loop
                (recur (inc i))
    )))

    (print "Factorial of 5 is ... ") 
    ;; enter the loop setting the initial value to 5 and the accumulator to 1
    (loop [n 5 acc 1]
        (if (= n 1)
            ;; terminate
            (println acc)
            ;; recur on decremented n and multiplied accumulator
            (recur (dec n) (* acc n))
    ))
)
