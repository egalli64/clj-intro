;;; sort, sort-by
;;
;; (sort seqable) for natural sorting
;; (sort comparator seqable) for natural sorting
;; (sort-by func seqable) apply the (key) function and use its returned value as key for sorting

(ns p2.ch4.b.e7)

(defn -main []
    (println "sort in natural order:" (sort [1 10 2 9 3 8 4 7 5 6]))
    (println "sort in reversed order:" (sort #(> %1 %2) [1 10 2 9 3 8 4 7 5 6]))
    (println "sort by count:" (sort-by count ["aaa" "c" "bb"]))
)
