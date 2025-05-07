;; Problem 20, Penultimate Element
;; https://4clojure.oxal.org/#/problem/20
;; (= (__ (list 1 2 3 4 5)) 4)
;; (= (__ ["a" "b" "c"]) "b")
;; (= (__ [[1 2] [3 4]]) [1 2])

;; thinking ...
(println "butlast returns a seq:" (butlast [:a :b :c]))
(println "drop-last returns a lazy seq:" (drop-last [:a :b :c])) ; (:a :b)

(println "On map (seq):" (butlast {:a 1 :b 2 :c 3}))
(println "On map (lazy seq):" (drop-last {:a 1 :b 2 :c 3})) ; ([:a 1] [:b 2])
(let [xs [:a :b :c]]
  (println xs "penultimate is" (last (drop-last xs))))      ; :b

;; solution
(let [__ #(last (drop-last %))]
  (print "Is the problem solved? ")
  (and (= (__ ["a" "b" "c"]) "b")
       (= (__ ["a" "b" "c"]) "b")
       (= (__ [[1 2] [3 4]]) [1 2])))
