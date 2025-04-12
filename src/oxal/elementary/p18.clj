;; Problem 18, filter
;; https://4clojure.oxal.org/#/problem/18
;; (= __ (filter #(> % 5) '(3 4 5 6 7)))

;; thinking ...
(println "Filtering by standard function:" (filter pos? [-1 2 -3]))
(println "Filtering by anon function:" (filter #(> % 0) '(-1 2 -3)))

;; my solution
(def solution [6 7])

(print "Is the problem solved? ")
(= solution (filter #(> % 5) '(3 4 5 6 7)))
