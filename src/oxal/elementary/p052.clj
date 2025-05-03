;; Problem 52, Intro to Destructuring
;; https://4clojure.oxal.org/#/problem/52
;; (= [2 4] (let [[a b c d e f g] (range)] __))

;; thinking ...
;; range generates lazily a sequence 0, 1, 2, ...
;; by destructuring, each symbol in a .. g is associated to the integer in 0 .. 6 (from range)
;; (kind of zip, but binds symbol to value)
;; to get the vector [2 4] we need to access the binding generated in the previous step with a vector of matching symbols
(println "This would generate [0 1]:" (let [[a b c d e f g] (range)] [a b]))

;; my solution: [c e]
(print "Is the problem solved? ")
(= [2 4] (let [[a b c d e f g] (range)] [c e]))