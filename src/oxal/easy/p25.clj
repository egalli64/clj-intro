;; Problem 25, Find the odd numbers
;; https://4clojure.oxal.org/#/problem/25
;; (= (__ #{1 2 3 4 5}) '(1 3 5))   : filter odd?
;; (= (__ [4 2 1 6]) '(1))          : filter odd?
;; (= (__ [2 2 4 6]) '())           : filter odd?
;; (= (__ [1 1 1 3]) '(1 1 1 3))    : filter odd?

;; elaborating on the theme
(println "filter works on any seq:")
(println "On vector:" (filter odd? [1 2 3]))
(println "On list:" (filter odd? '(1 2 3)))
(println "On set:" (filter odd? #{1 2 3}))
(println "On a limited range:" (filter odd? (range 4)))

(print "Is the actual problem solved? ")
(= (filter odd? [2 2 4 6]) '())
