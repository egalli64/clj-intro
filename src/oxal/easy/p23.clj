;; Problem 23, Reverse a Sequence
;; https://4clojure.oxal.org/#/problem/23
;; (= (__ [1 2 3 4 5]) [5 4 3 2 1])             : reverse
;; (= (__ (sorted-set 5 7 2 7)) '(7 5 2))       : reverse
;; (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]]) : reverse

;; elaborating on the theme
(println "reverse works on any seq:")
(println "On vector:" (reverse [:a :b :c]))
(println "On list:" (reverse '(:a :b :c)))
(println "On (array-)map:" (reverse {:a 1 :b 2 :c 3}))
(println "On hash-map (meaningless):" (reverse (hash-map :a 1 :b 2 :c 3)))
(println "On sorted-set:" (reverse (sorted-set :a :b :c)))
(println "On set (meaningless):" (reverse #{:a :b :c}))
(println "On a limited range:" (reverse (range 3)))

(print "Is the actual problem solved? ")
(= (reverse [1 2 3 4 5]) [5 4 3 2 1])