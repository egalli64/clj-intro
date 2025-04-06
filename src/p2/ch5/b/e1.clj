;;; recursion instead of loop

(ns p2.ch5.b.e1)

;; A plainly recursive function
;; Notice that, having no TCO, it makes sense to be called only on a short seq
(defn sum-plain
    ;; arity-1 overload, simplify the call for the user
    ([values] (sum-plain values 0))
    ;; arity-2 overload does the actual job recursively
    ([values acc] (
        ;; if the seq is empty returns the accumulator
        if (empty? values) 
            acc 
            ;; otherwise call recursively sum on rest and acc increased with first
            (sum-plain (rest values) (+ (first values) acc))))
)

;; recur alternative (TCO), the user could initialize the accumulator, when required
(defn sum-recur
    ([vals] (sum-recur vals 0))
    ([vals acc]
        (if (empty? vals)
            acc
        (recur (rest vals) (+ (first vals) acc)))))


;; loop - recur alternative (TCO), hides internally the use of accumulator
(defn sum-loop-recur [values]
    ;; "loop" (actually, TCO recurse) on the symbol values that shadows the outer parameter, and on the accumulator
    ;; the values binding in loop is initialized with the value of the outer parameter
    ;; acc is initialized to zero
    (loop [values values acc 0]
        ;; if the seq is empty returns the accumulator
        (if (empty? values)
            acc
            ;; otherwise recur on loop with rest and acc increased with first
            (recur (rest values) (+ (first values) acc))))
)

;; in this case we can use reduce
(defn sum-reduce [values] (reduce + 0 values))

(defn -main []
    ;; calling the plainly recursive sum function
    (println "Add up the elements of an empty seq:" (sum-plain []))
    (println "Add up the elements of a 'normal' se:" (sum-plain [1 2 3]))
    (println)

    ;; calling the recur based sum function
    (println "Add up the elements of an empty seq:" (sum-recur []))
    (println "Add up the elements of a 'normal' seq:" (sum-recur [1 2 3]))
    (println)

    ;; calling the loop-recur based sum function
    (println "Add up the elements of an empty seq:" (sum-loop-recur []))
    (println "Add up the elements of a 'normal' seq:" (sum-loop-recur [1 2 3]))
    (println)

    ;; calling the reduce based sum function
    (println "Add up the elements of an empty seq:" (sum-reduce []))
    (println "Add up the elements of a 'normal' seq:" (sum-reduce [1 2 3]))
)
