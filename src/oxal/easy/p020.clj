;; Problem 20, Penultimate Element
;; https://4clojure.oxal.org/#/problem/20
;; (= (__ (list 1 2 3 4 5)) 4)
;; (= (__ ["a" "b" "c"]) "b")
;; (= (__ [[1 2] [3 4]]) [1 2])

;; thinking ...
(println "butlast on seqable - it returns a lazy seq")
(println "On vector:" (butlast [:a :b :c]))                 ; -> (:a :b)
(println "For vector the actual type is a seq:" (type (butlast [:a :b])))
(println "On map:" (butlast {:a 1 :b 2 :c 3}))              ; -> ([:a 1] [:b 2])
(let [xs [:a :b :c]]
  (println xs "penultimate is" (last (butlast xs))))        ; -> :b

;; my solution
(let [solution #(last (butlast %))]
  (print "Is the problem solved? ")
  (and (= (solution ["a" "b" "c"]) "b")
       (= (solution ["a" "b" "c"]) "b")
       (= (solution [[1 2] [3 4]]) [1 2])))

