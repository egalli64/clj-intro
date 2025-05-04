;; Problem 19, Last Element
;; https://4clojure.oxal.org/#/problem/19
;; (= (__ [1 2 3 4 5]) 5)
;; (= (__ '(5 4 3)) 3)
;; (= (__ ["b" "c" "d"]) "d")

;; thinking ...
(println "Last in array-map:" (last {:a 1 :b 2 :c 3}))
(println "Last in hash-map:" (last (hash-map :a 1 :b 2 :c 3)))
(println "Last in set:" (last #{:a :b :c}))
;; but last is not an acceptable solution ...

;; reducing by a function that discards the acc and keep just the current element
;; all elements are discarded but the last one
(println (reduce (fn [_ x] x) #{:a :b :c}))

;; as a function
(defn my-last [xs] (reduce (fn [_ x] x) xs))
(println "Last in array-map:" (my-last {:a 1 :b 2 :c 3}))
(println "Last in hash-map:" (my-last (hash-map :a 1 :b 2 :c 3)))
(println "Last in set:" (my-last #{:a :b :c}))

;; my solution as anon function: (fn [xs] (reduce (fn [_ x] x) xs))
(print "Is the problem solved? ")
(let [solution (fn [xs] (reduce (fn [_ x] x) xs))]
     (and (= (solution '(5 4 3)) 3)
          (= (solution '(5 4 3)) 3)
          (= (solution ["b" "c" "d"]) "d"))
     )
