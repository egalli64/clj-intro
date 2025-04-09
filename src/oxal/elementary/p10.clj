;; Problem 10, Maps
;; https://4clojure.oxal.org/#/problem/10
;; (= __ ((hash-map :a 10, :b 20, :c 30) :b))   : 20
;; (= __ (:b {:a 10, :b 20, :c 30}))            : 20

;; elaborating on the theme
(println "Creating a map (literal):" {:a 1 :b 2 :c 3})
(println "Type for literal map (w/ insertion order):" (type {:a 1}))
(println "Creating an array-map (factory):" (array-map :a 1 :b 2 :c 3))
(println "Creating a hash-map (factory):" (hash-map :a 1 :b 2 :c 3))
(println "Type for hash-map:" (type (hash-map :a 1)))
(println "Creating a sorted-map (factory):" (sorted-map :b 2 :c 3 :a 1))
(println "Type for sorted-map:" (type (sorted-map :a 1)))

(println "Get value (key map):" (:a {:a 1}))
(println "Get value (map key):" ({:a 1} :a))
(println "Get value (get map key):" (get {:a 1} :a))
(println "Get value (missing):" (:b {:a 1}))
(println "Get value (missing w/ default):" (:b {:a 1} 42))

(print "Is the actual problem solved? ")
(= 20 (:b {:a 10, :b 20, :c 30}))
