;; Problem 9, conj on sets
;; https://4clojure.oxal.org/#/problem/9
;; (= #{1 2 3 4} (conj #{1 4 3} __)) : 2

;; elaborating on the theme
(println "The factory conj on set generates a new set")
(println "New element in the 'right' place:" (conj #{:a :b :c} :x))
(println "set type:" (type #{}))

(print "Is the actual problem solved? ")
(= #{1 2 3 4} (conj #{1 4 3} 2))
