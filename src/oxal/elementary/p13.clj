;; Problem 13, rest
;; https://4clojure.oxal.org/#/problem/13
;; (= __ (rest [10 20 30 40])) : [20 30 40]

;; elaborating on the theme
(println "list rest:" (rest '(:a :b :c)))
(println "vector rest:" (rest [:a :b :c]))
(println "map rest:" (rest {:a 1 :b 2 :c 3}))
(println "range rest:" (rest (range 6)))

(println "No rest, empty seq:")
(println "On single-element seq:" (rest [:a]))
(println "On empty seq:" (rest []))
(println "On nil:" (rest nil))

(print "Is the actual problem solved? ")
(= [20 30 40] (rest [10 20 30 40]))
