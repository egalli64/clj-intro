;;; conj adds elements to a collection
;;
;; (conj coll x ...)
;; similar to cons, but cons returns a lazy seq (or a list) while conj is collection friendly
;; similar to into, but conj is meant to add one (or few) elements to a collection, into is for collection merging


(ns p2.ch4.d.e5)

(defn -main []
    (println "conj on list, add front:" (conj '(1 2 3) 99))
    (println "conj on vector, add back:" (conj [1 2 3] 99))
    (println "conj on set, (no duplicates):" (conj #{1 2 3} 3))
    (println "conj on map, (add/update):" (conj {:a 1 :b 2} [:b 99]))

    (println "conj to multi add:" (conj [1 2] 3 4 5))
)
