;; Problem 37, Regular Expressions
;; https://4clojure.oxal.org/#/problem/37
;; (= __ (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))

;; thinking ...
;; re-seq returns a lazy seq of successive matches
;; "[A-Z]+" matches each seq of uppercase chars
;; apply spreads the element of the seq resulting from re-seq
;;    and applies the str function to them
(= "ABC" (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))

;; my solution
(def solution "ABC")

(print "Is the problem solved? ")
(= solution (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))
