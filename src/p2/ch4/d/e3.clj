;;; every? checks if all elements in a collection satisfy a predicate
;;
;; when invoked on a collection, it firstly checks if there is at least an element
;; when invoked on a lazy-seq, the elements are lazily realized
;; when invoked on a map, the map is coerced in a sequence of k-v pairs

(ns p2.ch4.d.e3)

(defn -main[]
    (println "empty seq every? (yes):" (every? #(= % 42) []))
    (println "vector every? element is 42 (yes):" (every? #(= % 42) [42 42 42]))
    (println "list every? element is 42 (yes)" (every? #(= % 42) '(42 42 42)))
    (println "set every? element is even? (yes)" (every? even? #{2 4 6}))
    (println "map every? value is even?" (every? (fn [[k v]] (even? v)) {:a 2 :b 4 :c 6}))
    (println "seq every? element is even? (yes)" (every? even? (range 0 10 2)))
    (println "seq every? element is even? (infinite, no)" (every? even? (range)))
    (println "nil every? element is 42 (yes!)" (every? even? nil))
)
