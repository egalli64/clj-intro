;; Problem 18, filter
;; https://4clojure.oxal.org/#/problem/18
;; (= __ (filter #(> % 5) '(3 4 5 6 7))) : [6 7]

;; elaborating on the theme
(println "Filtering by standard function:" (filter pos? [-1 2 -3]))
(println "Filtering by anon function:" (filter #(> % 0) '(-1 2 -3)))

(print "Is the actual problem solved? ")
(= [6 7] (filter #(> % 5) '(3 4 5 6 7)))
