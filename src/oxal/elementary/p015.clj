;; Problem 15, Double Down
;; https://4clojure.oxal.org/#/problem/15
;; (= (__ 2) 4)
;; (= (__ 3) 6)
;; (= (__ 11) 22)
;; (= (__ 7) 14)

;; thinking ...
(defn doubler [x] (* x 2))

(println "Doubling by function")
(println "Calling a def function:" (doubler 21))
(println "Calling a fn function:" ((fn [x] (* x 2)) 21))
(println "Calling an anon function:" (#(* % 2) 21))
(println "Calling a partial function:" ((partial * 2) 21))

;; my solution
(def solution #(* % 2))

(print "Is the problem solved? ")
(= (solution 2) 4)
