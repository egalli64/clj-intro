;;; loop-recur: tail recursive function with tail-call optimization (TCO)
;;
;; basic syntax: (loop [bindings] body-with-recur)

(ns p2.ch3.d.e2)

(defn -main []
    ;; enter the loop setting the initial value to 1
    (loop [i 1]
        ;; terminate or recur on the increased value
        (if (> i 3) (println "Go!") (do (print i "... ") (recur (inc i))))
    )

    (print "Factorial of 5 is ... ") 
    ;; enter the loop setting the initial value to 5 and the accumulator to 1
    (loop [n 5 acc 1]
        ;; terminate or recur on decremented n and multiplied accumulator
        (if (= n 1) (println acc) (recur (dec n) (* acc n)))
    )
)
