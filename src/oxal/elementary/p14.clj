;; Problem 14, Functions
;; https://4clojure.oxal.org/#/problem/14
;; (= __ ((fn add-five [x] (+ x 5)) 3)) : 8
;; (= __ ((fn [x] (+ x 5)) 3))          : 8
;; (= __ (#(+ % 5) 3))                  : 8
;; (= __ ((partial + 5) 3))             : 8

;; elaborating on the theme
(defn add-five [x] (+ x 5))
(println "Invoking a defn function:" (add-five 3))

(println "fn function:" ((fn add-five [x] (+ x 5)) 3))
(println "fn anon function:" ((fn [x] (+ x 5)) 3))
(println "anon function:" (#(+ % 5) 3))
(println "partial function:" ((partial + 5) 3))

(print "Is the actual problem solved? ")
(= 8 ((partial + 5) 3))
