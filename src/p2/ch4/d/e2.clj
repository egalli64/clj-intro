;;; empty? checks if a collection is empty
;;
;; when invoked on a collection, checks if there is at least an element
;; when invoked on a lazy-seq, requires that the first element is realized

(ns p2.ch4.d.e2)

(defn -main[]
    (println "vector empty? (yes)" (empty? []))
    (println "vector empty? (no)" (empty? [1]))
    (println "list empty?" (empty? '()))
    (println "set empty?" (empty? #{}))
    (println "map empty?" (empty? {}))
    (println "seq empty? (yes)" (empty? (range 0 0)))
    (println "seq empty? (no)" (empty? (range)))
    (println "nil empty? (yes!)" (empty? nil))
)
