;;; filter, some
;; (filter func seqable) returns a lazy seq
;; (some func sequable) returns true if there is at least a value satisfying func, or nil

(ns brave.p2.ch4.b.e6)

(defn -main []
    (let [data [1 10 2 9 3 8 4 7 5 6]]
        (println "Original data:" data)

        ;; filter
        (println "filter less than 5:" (filter #(< % 5) data))
        (println "filter less than 0:" (filter #(< % 0) data))

        ;; some, returning true / the value found
        (println "some more than 5?" (some #(> % 5) data))
        (println "some more than 5? its value or nil:" (some #(and (> % 5) %) data))
        ;; some, returning nil
        (println "some more than 10?" (some #(> % 10) data))
        (println "some more than 10? its value or nil:" (some #(and (> % 10) %) data))
    )
)
