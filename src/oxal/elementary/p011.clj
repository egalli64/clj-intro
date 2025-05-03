;; Problem 11, conj on maps
;; https://4clojure.oxal.org/#/problem/11
;; (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))

;; thinking ...
(println "The factory conj on map generates a new map")
(println "New element in the 'right' place:" (conj {:a 1} {:b 2}))
(println "A small map type is" (type(conj {:a 1} {:b 2})))

;; my solution
(def solution {:b 2})

(print "Is the problem solved? ")
(= {:a 1, :b 2, :c 3} (conj {:a 1} solution [:c 3]))
