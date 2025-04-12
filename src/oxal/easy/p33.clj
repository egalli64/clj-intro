;; Problem 33, Replicate a Sequence
;; Replicate each element a given number of times
;; https://4clojure.oxal.org/#/problem/33
;; (= (__ [1 2 3] 2) '(1 1 2 2 3 3))
;; (= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))
;; (= (__ [4 5 6] 1) '(4 5 6))
;; (= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))
;; (= (__ [44 33] 2) [44 44 33 33])

;; thinking ...
(defn repl [xs, n] (mapcat #(repeat n %) xs))
(println "In a function:" (repl '(:1 :2 :3) 3))

;; the solution

(def solution (fn repl [xs, n] (mapcat #(repeat n %) xs)))

;; verify it
(print "Is the problem solved? ")
(= (solution [1 2 3] 2) '(1 1 2 2 3 3))
