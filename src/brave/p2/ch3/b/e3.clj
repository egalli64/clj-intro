;;; vector [] indexed access

(ns brave.p2.ch3.b.e3)

(defn -main []
    ;; using _vector literal_ to create vector objects
    (println "An empty vector (literal):" [])
    (println "A vector with three items (literal):" [1 2 3])

    ;; same, but using the vector constructor
    (println "An empty vector (constructor):" (vector))
    (println "A vector with three entries (constructor):" (vector 1 2 3))

    ;; getting a value by index by _get function_
    (println "Get the first value ..." (get [1 2 3] 0))
    (println "No element with index 3 ..." (get [1 2 3] 3))    ; returns nil
    (println "Defaulting out of bounds to ..." (get [1 2 3] 3 "missing"))    ; returns "missing"

    ;; adding more elements to a vector by _conj function_ (conj is short for conjoin)
    (println "Adding an item ..." (conj [1 2 3] 4))
    (println "Adding more items ..." (conj [1 2 3] 4 5))
    (println "Adding a vector as a _single_ new item ..." (conj [1 2 3] [4 5 6]))
)
