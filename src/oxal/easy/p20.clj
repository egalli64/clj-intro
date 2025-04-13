;; Problem 20, Penultimate Element
;; https://4clojure.oxal.org/#/problem/20
;; (= (__ (list 1 2 3 4 5)) 4)
;; (= (__ ["a" "b" "c"]) "b")
;; (= (__ [[1 2] [3 4]]) [1 2])

;; thinking ...
(println "butlast on seqable - it returns a lazy seq")
(println "On vector:" (butlast [:a :b :c]))
(println "For vector the actual type is:" (type (butlast [:a :b])))
(println "On map:" (butlast {:a 1 :b 2 :c 3}))
(let [xs [:a :b :c]] (println xs "penultimate is" (last (butlast xs))))

;; my solution
(def solution #(last (butlast %)))

(print "Is the problem solved? ")
(= (solution ["a" "b" "c"]) "b")
