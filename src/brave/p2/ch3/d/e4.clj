;;; function _into_ used to copy elements from a collection to another one
;;
;; basic syntax: (into to-coll from-coll)
;; overload with transducer: (into to-coll transducer from-coll)

(ns brave.p2.ch3.d.e4)

(defn -main []
    (print "Using into to generate a vector from a set: ")
    (let [a-set #{1 2 3}]
        ;; copy into a new vector the elements of the set
        (println a-set " ... " (into [] a-set))
    )

    (print "From vector to set: ")
    (let [a-vector [1 1 2 3 3]]
        ;; copy into a new set the elements of the vector
        (println a-vector " ... " (into #{} a-vector))
    )

    (println "Merging maps: " 
        ;; merging in the first map the elements from the second one
        (into {:a 1} {:b 2 :c 3})
    )

    (println "Transducing by map increase: "
        ;; copy into a new vector the mapped elements of the source one
        (into [] (map inc) [1 2 3])
    )
)
