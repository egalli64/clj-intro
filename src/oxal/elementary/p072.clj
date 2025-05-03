;; Problem 72, Rearranging Code: ->> (thread-last macro)
;; https://4clojure.oxal.org/#/problem/72
;; (= (__ (map inc (take 3 (drop 2 [2 5 4 1 3 6])))) (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (__)) 11)

;; thinking ...
;; the first form drop the first two items, take three, map by increase to (5 2 4)
;; same the second form, just using ->>
;; notice that we must use ->> because the seq is the last argument for drop, take, map
;; they both should result in 11, that is, the sum of the elements

;; my solution: apply +

(print "Is the problem solved? ")
(= (apply + (map inc (take 3 (drop 2 [2 5 4 1 3 6])))) (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (apply +)) 11)