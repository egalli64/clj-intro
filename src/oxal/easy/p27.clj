;; Problem 27, Palindrome Detector
;; https://4clojure.oxal.org/#/problem/27
;; (false? (__ '(1 2 3 4 5)))
;; (true? (__ "racecar"))           : #(= (seq %) (reverse (seq %)))
;; (true? (__ [:foo :bar :foo]))
;; (true? (__ '(1 1 3 3 1 1)))
;; (false? (__ '(:a :b :c)))
;; patch for strings, converted to a seq of chars

;; elaborating on the theme
(println "reverse works on any seq")
(println "On vector:" (reverse [1 2 3]))
(println "On list:" (reverse '(1 2 3)))
(println "On set (meaningless):" (reverse #{1 2 3}))
(println "On a limited range:" (reverse (range 1 4)))
(println "On string (ouch!):" (reverse "123"))

(println "Comparing a string with its reverse is natural?" (= "321" (reverse "123")))
(println "Comparing a seq with its reverse is natural?" (= (seq "321") (reverse "123")))

(print "Is the actual problem solved? ")
(false? (#(= (seq %) (reverse (seq %))) '(:a :b :c)))
