;;; For more info read Living Clojure by Carin Meier
;; Collections
;; Maps for Storing Key-Value Pairs of Data

;; in a map commas could improve readability
(def data {:a 1, :b 2, :c 3})
(println "A map:" data)

(println "First:" (first data))
(println "Rest:" (rest data))
(println "Last:" (last data))
;; nth leads to UnsupportedOperationException
;; (println "Nth (2):" (nth data 2))
(println "Count:" (count data))

(println "Get (by key):" (get data :b))
(println "Get (w/ default):" (get data :k "not found"))
(println "Get (using key as function on map - preferred):" (:b data))
(println "Get (using map as function on key):" (data :b))

(println "Keys:" (keys data))
(println "Vals:" (vals data))

(println "Assoc (new val):" (assoc data :b 42))
(println "Assoc (new key/val):" (assoc data :x 42))
(println "Dissoc (by key):" (dissoc data :b))

;; merge is kind of generalized assoc - last come wins
(println "Merge more maps:" (merge data {:b 4, :c 4} {:c 5 :d 5} {:d 6 :e 6}))
