;;; sequence and seqable
;;
;; a sequence is the abstraction of a list that could be traversed one element at a time
;; traversing meaning apply the idiom first-rest-next
;;
;; a seqable is data structure that could be converted to a sequence by seq()

(ns p2.ch4.a.e1)

(defn -main []
    (let [xs '(1 2 3)]
        (println "A list:" xs 
            "is a sequence?" (seq? xs)      ; true
            "is a seqable?" (seqable? xs)   ; true
    ))

    ;; vector is not a sequence, but can act like it
    (let [xs [1 2 3]]
        (println "A vector:" xs
            "is a sequence?" (seq? xs)      ; false
            "is a seqable?" (seqable? xs)   ; true
    ))

    ;; set is not a sequence, but can act like it
    (let [xs #{1 2 3}]
        (println "A set:" xs
            "is a sequence?" (seq? xs)      ; false
            "is a seqable?" (seqable? xs)   ; true
    ))

    ;; map is not a sequence, but can act like it
    (let [xs {:a 1 :b 2 :c 3}]
        (println "A map:" xs
            "is a sequence?" (seq? xs)      ; false
            "is a seqable?" (seqable? xs)   ; true
    ))
)
