;; Problem 14, Functions
;; https://4clojure.oxal.org/#/problem/14
;; (= __ ((fn add-five [x] (+ x 5)) 3))
;; (= __ ((fn [x] (+ x 5)) 3))
;; (= __ (#(+ % 5) 3))
;; (= __ ((partial + 5) 3))

;; thinking ...
(defn add-five [x] (+ x 5))
(println "Invoking a defn function:" (add-five 3))

(println "fn function:" ((fn add-five [x] (+ x 5)) 3))
(println "fn anon function:" ((fn [x] (+ x 5)) 3))
(println "anon function:" (#(+ % 5) 3))
(println "partial function:" ((partial + 5) 3))

;; my solution
(def solution 8)

(print "Is the problem solved? ")
(= solution ((partial + 5) 3))
