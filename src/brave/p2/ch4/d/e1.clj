;;; count - returns the number of items in a collection
;;
;; it's O(1) for all collection, but list, O(n)
;; On a lazy seq requires its realization before invoking

(ns brave.p2.ch4.d.e1)

(defn -main[]
    (println "count vector:" (count [1 2 3]))
    (println "count list:" (count '(1 2 3)))
    (println "count set:" (count #{1 2 3}))
    (println "count map:" (count {:a 1 :b 2 :c 3}))
    (println "count lazy seq:" (count (range 3)))
    ;; uncomment next line to loop indefinitely
    ;; (count (range))
)
