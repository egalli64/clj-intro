;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Easy 4ever-clojure exercises
;; Problem 49, Split a sequence
;; Split a sequence, give the size of the first resulting sub
;; https://4clojure.oxal.org/#/problem/49
;; (= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
;; (= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])
;; (= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])

;; thinking ...
;; that's what split-at does, but we can't use it
(split-at 1 [:a :b])

(let [my-split-at
      (fn [n coll]
        (loop [n n, left [], right coll]
          (if (< n 1) [left right] (recur (dec n) (conj left (first right)) (rest right)))
          )
        )]
  (my-split-at 1 [:a :b :c]))

(let [my-split-at
      (fn [n coll] [(take n coll) (drop n coll)])]
  (my-split-at 1 [:a :b :c]))

;; solution
(let [__ #(vector (take %1 %2) (drop %1 %2))]
  (and
    (= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
    (= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])
    (= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])
    ))
