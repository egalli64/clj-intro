;; Problem 19, Last Element
;; https://4clojure.oxal.org/#/problem/19
;; Special Restrictions: last
;; (= (__ [1 2 3 4 5]) 5)       : last
;; (= (__ '(5 4 3)) 3)          : last
;; (= (__ ["b" "c" "d"]) "d")   : last

;; elaborating on the theme
(println "Last in array-map:" (last {:a 1 :b 2 :c 3}))
(println "Last in hash-map:" (last (hash-map :a 1 :b 2 :c 3)))
(println "Last in set:" (last #{:a :b :c}))

(print "Is the actual problem solved? ")
(= (last '(5 4 3)) 3)
