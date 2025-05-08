;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Easy 4ever-clojure exercises
;; Problem 63, Group a Sequence
;; Group the seq passed as determined by the passed function
;; https://4clojure.oxal.org/#/problem/63
;; (= (__ #(> % 5) #{1 3 6 8}) {false [1 3], true [6 8]})
;; (= (__ #(apply / %) [[1 2] [2 4] [4 6] [3 6]]) {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]})
;; (= (__ count [[1] [1 2] [3] [1 2 3] [2 3]]) {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})

;; thinking ...
;; we can't use group-by, that is exactly what we need
(= (group-by #(> % 5) #{1 3 6 8}) {false [1 3], true [6 8]})

;; TODO

;; solution
(let [__ group-by]
  (and (= (__ #(> % 5) #{1 3 6 8}) {false [1 3], true [6 8]})
       (= (__ #(apply / %) [[1 2] [2 4] [4 6] [3 6]]) {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]})
       (= (__ count [[1] [1 2] [3] [1 2 3] [2 3]]) {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})))
