;;; list

(ns p2.ch3.b.e4)

(defn -main []
    ;; using _list literal_ to create list objects
    (println "An empty list:" '())
    (println "A list with three items:" '(1 2 3))

    ;; same, but using the list constructor
    (println "An empty list:" (list))
    (println "A list with three items:" (list 1 2 3))

    ;; getting a value by index by _nth function_
    (println "Get the first value ..." (nth '(1 2 3) 0))
    (println "Get the last value ..." (nth '(1 2 3) 2))

    ;; adding more elements to a list by _conj function_ put them at the beginning (for performance reasons)
    (println "Adding an item ..." (conj '(1 2 3) 4))
    (println "Adding more items ..." (conj '(1 2 3) 4 5))
    (println "Adding a list as a _single_ new item ..." (conj '(1 2 3) '(4 5 6)))
)