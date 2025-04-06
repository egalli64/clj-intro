;;; map to seq, seq to map
;; a map in sequence context becomes a sequence of key-value pairs
;; each pair is a MapEntry, that acts as a vector

(ns p2.ch4.a.e3)

(defn -main []
    ;; explicitly generate a sequence of pairs from a map
    (let [a_map {:a 1 :b 2 :c 3} a_seq (seq a_map)]
        (println "From map" a_map "to seq" a_seq)

        ;; using the explicit conversion to seq
        (println "Get all keys (from seq):" (map first a_seq))
        (println "Get all values (from seq):" (map second a_seq))

        ;; implicit conversion to seq (being a seqable)
        (println "Get all keys (from map):" (map first a_map))
        (println "Get all values (from map):" (map second a_map))

        ;; use into to convert the seq to a map
        (println "From seq" a_seq "into a map" (into {} a_seq))
    )
)
