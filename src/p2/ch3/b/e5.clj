;;; sets: #{}, hash-set - no duplicates
;; use the factory function set to generate a hash-set
;; sorted-set is also available

(ns p2.ch3.b.e5)

(defn -main []
    ;; using _set literal_ to create hash set objects
    (println "An empty hash set:" #{})
    (println "A hash set with three items:" #{1 2 3})

    ;; same (but notice the discarded duplicates) using the hash-set constructor
    (println "An empty hash set:" (hash-set))
    (println "A hash set with three items:" (hash-set 1 2 3 3 2 1))

    ;; adding one or more elements to a set by _conj function_
    (println "Adding an item ..." (conj #{1 2 3} 4))
    (println "Adding more items (no duplicates) ..." (conj #{1 2 3} 4 5 3))
    (println "Adding a set as a _single_ new item ..." (conj #{1 2 3} #{1 2 3}))

    ;; converting a collection to a (hash) set
    (println "Get a set from an array ..." (set [1 2 3 3 2 1]))

    ;; checking membership by _contains?_ - returns true/false
    (println "Does the set contain 3?" (contains? #{1 2 3} 3))
    (println "Does the set contain 4?" (contains? #{1 2 3} 4))

    ;; checking membership by _get_ - returns value/nil
    (println "Get 3 from the set ..." (get #{1 2 3} 3))
    (println "Get on missing ..." (get #{1 2 3} 4))

    ;; checking membership by keyword - returns keyword/nil
    (println "Shortcut for keywords ..." (:3 #{:1 :2 :3}))
    (println "Shortcut on missing ..." (:4 #{:1 :2 :3}))
)
