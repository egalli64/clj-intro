;;; maps: key - value relation
;; the key is usually a _keyword_ (symbol prefixed by colon)
;; a _keyword_ is a symbolic constant that does not have any associated value
;; the map value could be anything

(ns p2.ch3.b.e2)


(defn -main []
    ;; using _map literal_ to create map objects
    (println "An empty map:" {})
    (println "A map with three entries:" {:a 1 :b 2 :c 3})

    ;; same, but using the hash-map constructor
    (println "An empty map:" (hash-map))
    (println "A map with three entries:" (hash-map :a 1 :b 2 :c 3))

    ;; getting a value from a map by key by _get function_
    (println "Get the value associated to :b ..." (get {:a 1 :b 2 :c 3} :b))    ; returns 2
    (println "No value associated to :x ..." (get {:a 1 :b 2 :c 3} :x))    ; returns nil
    (println "No value associated, defaulted to ..." (get {:a 1 :b 2 :c 3} :x "missing"))    ; returns "missing"

    ;; use _get-in function_ to get from sub-maps
    (println "Value for :b :x ..." (get-in {:a 1 :b {:x 2}} [:b :x]))   ; returns 2

    ;; using the keyword as a function, as a get shortcut
    (println "Get value by keyword ..." (:b {:a 1 :b 2 :c 3}))    ; returns 2
    (println "Default works too ..." (:x {:a 1 :b 2 :c 3} "missing"))    ; returns "missing"
)
