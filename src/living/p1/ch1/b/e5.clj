;;; For more info read Living Clojure by Carin Meier
;; Collections
;; Using Sets for Unique Collections of Data

;; a set
(def data #{:a :b :c})
(println "A set:" data)

;; Syntax error: Duplicate key: :a
;; (def more #{:a :b :c :a})

;; first, rest, last can give unexpected results
(println "First:" (first data))
(println "Rest:" (rest data))
(println "Last:" (last data))
;; nth leads to UnsupportedOperationException
;; (println "Nth (2):" (nth data 2))
(println "Count:" (count data))

;; get functions are available but not idiomatic
(println "Get (by key):" (get data :b))
(println "Get (w/ default):" (get data :k "not found"))
(println "Get (using key as function on map - preferred):" (:b data))
(println "Get (using map as function on key):" (data :b))

;; set theory functions
(require '[clojure.set :as set])
(println "Union: " (set/union data #{:d :e :f}))
(println "Difference: " (set/difference data #{:b :c :d}))
(println "Intersection: " (set/intersection data #{:b :c :d}))

;; create a set from another collection
(println "Set from vector:" (set [:a :b :b :a]))
(println "Set from map:" (set {:a 1, :b 2, :c 3, :d 4}))

;; check for presence
(println "Contains (yes)?" (contains? data :a))
(println "Contains (no)?" (contains? data :x))

;; add/remove elements
(println "Conj:" (conj data :a :d))
(println "Disj:" (disj data :a :d))
