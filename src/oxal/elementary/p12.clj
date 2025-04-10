;; Problem 12, Sequences
;; https://4clojure.oxal.org/#/problem/12
;; (= __ (first '(3 2 1)))      : 3
;; (= __ (second [2 3 4]))      : 3
;; (= __ (last (list 1 2 3)))   : 3

;; elaborating on the theme
(println "first on seq")
(println "On list:" (first '(:a :b :c)))
(println "On vector:" (first [:a :b :c]))
(println "On map:" (first {:a 1 :b 2 :c 3}))
(println "On range:" (first (range)))

(println "second on seq")
(println "On list:" (second '(:a :b :c)))
(println "On vector:" (second [:a :b :c]))
(println "On map:" (second {:a 1 :b 2 :c 3}))
(println "On range:" (second (range)))

(println "last on seq")
(println "On list:" (last '(:a :b :c)))
(println "On vector:" (last [:a :b :c]))
(println "On map:" (last {:a 1 :b 2 :c 3}))
(println "On range:" (last (range 10)))


(print "Is the actual problem solved? ")
(= 3 (first '(3 2 1)))
