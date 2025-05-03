;; Problem 71, Rearranging Code: -> (thread-first macro)
;; https://4clojure.oxal.org/#/problem/71
;; (= (__ (sort (rest (reverse [2 5 4 1 3 6])))) (-> [2 5 4 1 3 6] reverse rest sort __) 5)

;; thinking ...
;; the first form reverse the vector, sort the rest (6 discarded)
;; same the second form, just using ->
;; they both should result in 5, that is their last element

;; my solution: last

(print "Is the problem solved? ")
(= (last (sort (rest (reverse [2 5 4 1 3 6])))) (-> [2 5 4 1 3 6] reverse rest sort last) 5)