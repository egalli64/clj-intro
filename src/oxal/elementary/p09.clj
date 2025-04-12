;; Problem 9, conj on sets
;; https://4clojure.oxal.org/#/problem/9
;; (= #{1 2 3 4} (conj #{1 4 3} __))

;; thinking ...
(println "The factory conj on set generates a new set")
(println "New element in the 'right' place:" (conj #{:a :b :c} :x))
(println "set type:" (type #{}))

;; my solution
(def solution 2)

(print "Is the problem solved? ")
(= #{1 2 3 4} (conj #{1 4 3} solution))
