;;; into takes a target collection and fill it with elements from another collection or seq
;;
;; many clj functions returns a seq, into is commonly used to convert a seq to a given collection

(ns p2.ch4.d.e4)

(defn -main []
    ;; the identity function keeps the input as is, but map returns a lazy seq!
    (let [a_map {:a 1 :b 2 :c 3} a_seq (map identity a_map)]
        (println "A map:" a_map)
        (println "That map as seq:" a_seq)
        (println "Back to map, by into:" (into {} a_seq))
    )

    ;; list to vector
    (println "into a vector from a list:" (into [] '(1 2 3)))
    ;; vector to set (removes duplicates)
    (println "into a set from a vector:" (into #{} [1 2 2 3]))
    ;; vector to list (lists add to front!)
    (println "into a list from a vector:" (into '(1 2) [3 4]))
)
