;; Problem 15, Double Down
;; https://4clojure.oxal.org/#/problem/15
;; (= (__ 2) 4)     #(* % 2)
;; (= (__ 3) 6)     #(* % 2)
;; (= (__ 11) 22)   #(* % 2)
;; (= (__ 7) 14)    #(* % 2)

;; elaborating on the theme
(defn doubler [x] (* x 2))

(println "Doubling by function")
(println "Calling a def function:" (doubler 21))
(println "Calling a fn function:" ((fn [x] (* x 2)) 21))
(println "Calling an anon function:" (#(* % 2) 21))
(println "Calling a partial function:" ((partial * 2) 21))

(print "Is the actual problem solved? ")
(= (#(* % 2) 2) 4)
