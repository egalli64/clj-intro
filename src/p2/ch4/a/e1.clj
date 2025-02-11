;;; sequence and seqable
;;
;; a sequence is the abstraction of a list that could be traversed one element at a time
;; a seqable is data structure that could be converted to a sequence by seq()

(ns p2.ch4.a.e1)

(defn -main []
    ;; list is a sequence
    (let [xs '(1 2 3)]
        (println "A list:" xs "sequence?" (seq? xs) "seqable?" (seqable? xs))
    )

    ;; vector is seqable
    (let [xs [1 2 3]]
        (println "A vector:" xs "sequence?" (seq? xs) "seqable?" (seqable? xs))
    )

    ;; set is seqable
    (let [xs #{1 2 3}]
        (println "A set:" xs "sequence?" (seq? xs) "seqable?" (seqable? xs))
    )

    ;; map is seqable
    (let [xs {:a 1 :b 2 :c 3}]
        (println "A map:" xs "sequence?" (seq? xs) "seqable?" (seqable? xs))
    )
)
