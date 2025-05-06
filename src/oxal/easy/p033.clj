;; Problem 33, Replicate a Sequence
;; Replicate each element a given number of times
;; https://4clojure.oxal.org/#/problem/33
;; (= (__ [1 2 3] 2) '(1 1 2 2 3 3))
;; (= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))
;; (= (__ [4 5 6] 1) '(4 5 6))
;; (= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))
;; (= (__ [44 33] 2) [44 44 33 33])

;; thinking ...

;; from problem 32, duplicate elements in a seq
(println (#(repeat 2 %) '(:1 :2 :3)))                       ; (:1 :1 :2 :2 :3 :3)
;; more than two copies for each element
(println (#(repeat %1 %2) 3 '(:1 :2 :3)))                   ; (:1 :1 :2 :2 :3 :3)
(println (#(repeat 4 %1) [:a :b]))                          ; ([:a :b] [:a :b] [:a :b] [:a :b])
(println (mapcat #(repeat 4 %1) [:a :b]))                   ; (:a :a :a :a :b :b :b :b)

;; solution
(let [solution (fn [xs, n] (mapcat #(repeat n %) xs))]
  (print "Is the problem solved? ")
  (and (= (solution [1 2 3] 2) '(1 1 2 2 3 3))
       (= (solution [:a :b] 4) '(:a :a :a :a :b :b :b :b))
       (= (solution [4 5 6] 1) '(4 5 6))
       (= (solution [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))
       (= (solution [44 33] 2) [44 44 33 33])))
