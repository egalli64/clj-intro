;; Problem 20, Penultimate Element
;; https://4clojure.oxal.org/#/problem/20
;; (= (__ (list 1 2 3 4 5)) 4)  : #(last (butlast %))
;; (= (__ ["a" "b" "c"]) "b")   : #(last (butlast %))
;; (= (__ [[1 2] [3 4]]) [1 2]) : #(last (butlast %))

;; elaborating on the theme
(println "butlast on seqable - it returns a lazy seq")
(println "On vector:" (butlast [:a :b :c]))
(println "For vector the actual type is:" (type (butlast [:a :b])))
(println "On map:" (butlast {:a 1 :b 2 :c 3}))

(print "Is the actual problem solved? ")
(= (#(last (butlast %)) ["a" "b" "c"]) "b")
