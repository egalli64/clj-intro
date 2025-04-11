;; Problem 24, Sum It All Up
;; https://4clojure.oxal.org/#/problem/24
;; (= (__ [1 2 3]) 6)           : reduce +
;; (= (__ (list 0 -2 5 5)) 8)   : reduce +
;; (= (__ #{4 2 1}) 7)          : reduce +
;; (= (__ '(0 0 -1)) -1)        : reduce +
;; (= (__ '(1 10 3)) 14)        : reduce +

;; elaborating on the theme
(println "reduce works on any seq:")
(println "On vector:" (reduce + [1 2 3]))
(println "On list:" (reduce + '(1 2 3)))
(println "On set:" (reduce + #{1 2 3}))
(println "On a limited range:" (reduce + (range 4)))

(println "On nil:" (reduce + nil))

(print "Is the actual problem solved? ")
(= (reduce + [1 2 3]) 6)
