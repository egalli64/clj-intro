;; Problem 31, Pack a Sequence
;; https://4clojure.oxal.org/#/problem/30
;; (= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
;; (= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
;; (= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))

;; thinking ...
;; see problem 30

;; my solution
(let [solution #(partition-by identity %)]
  (print "Is the problem solved? ")
  (and (= (solution [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
       (= (solution [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
       (= (solution [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))))
