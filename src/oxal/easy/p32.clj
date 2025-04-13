;; Problem 32, Duplicate a Sequence
;; https://4clojure.oxal.org/#/problem/32
;; (= (__ [1 2 3]) '(1 1 2 2 3 3))
;; (= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
;; (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
;; (= (__ [44 33]) [44 44 33 33])

;; thinking ...
(print "Duplicate the seq: ")
(println (repeat 2 [:1 :2 :3]))
(print "Duplicate each element in the seq: ")
(println (map #(repeat 2 %) '(:1 :2 :3)))
(print "Flatten the duplicated elements: ")
(println (mapcat #(repeat 2 %) '(:1 :2 :3)))

(defn dup [xs] (mapcat #(repeat 2 %) xs))
(println "In a function:" (dup '(:1 :2 :3)))

;; my solution
(def solution (fn [xs] (mapcat #(repeat 2 %) xs)))

;; verify it
(print "Is the problem solved? ")
(= (solution [44 33]) [44 44 33 33])
