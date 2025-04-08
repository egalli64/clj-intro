;; Problem 19, Last Element
;; https://4clojure.oxal.org/#/problem/19
;; Special Restrictions: last
;; (= (__ [1 2 3 4 5]) 5)
;; (= (__ '(5 4 3)) 3)
;; (= (__ ["b" "c" "d"]) "d")
last

;; Problem 20, Penultimate Element
;; https://4clojure.oxal.org/#/problem/20
;; (= (__ (list 1 2 3 4 5)) 4)
;; (= (__ ["a" "b" "c"]) "b")
;; (= (__ [[1 2] [3 4]]) [1 2])
#(last (butlast %))

;; Problem 21, Nth Element
;; https://4clojure.oxal.org/#/problem/21
;; Special Restrictions: nth
;; (= (__ '(4 5 6 7) 2) 6)
;; (= (__ [:a :b :c] 0) :a)
;; (= (__ [1 2 3 4] 1) 2)
;; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])
nth

;; Problem 22, Count a Sequence
;; https://4clojure.oxal.org/#/problem/22
;; Special Restrictions: count
;; (= (__ '(1 2 3 3 1)) 5)
;; (= (__ "Hello World") 11)
;; (= (__ [[1 2] [3 4] [5 6]]) 3)
;; (= (__ '(13)) 1)
;; (= (__ '(:a :b :c)) 3)
count

;; Problem 23, Reverse a Sequence
;; https://4clojure.oxal.org/#/problem/23
;; Special Restrictions: reverse
;; (= (__ [1 2 3 4 5]) [5 4 3 2 1])
;; (= (__ (sorted-set 5 7 2 7)) '(7 5 2))
;; (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])
reverse

;; Problem 24, Sum It All Up
;; https://4clojure.oxal.org/#/problem/24
;; (= (__ [1 2 3]) 6)
;; (= (__ (list 0 -2 5 5)) 8)
;; (= (__ #{4 2 1}) 7)
;; (= (__ '(0 0 -1)) -1)
;; (= (__ '(1 10 3)) 14)
reduce +

;; Problem 25, Find the odd numbers
;; https://4clojure.oxal.org/#/problem/25
;; (= (__ #{1 2 3 4 5}) '(1 3 5))
;; (= (__ [4 2 1 6]) '(1))
;; (= (__ [2 2 4 6]) '())
;; (= (__ [1 1 1 3]) '(1 1 1 3))
filter odd?

;; Problem 26, Fibonacci Sequence
;; https://4clojure.oxal.org/#/problem/26
;; (= (__ 3) '(1 1 2))
;; (= (__ 6) '(1 1 2 3 5 8))
;; (= (__ 8) '(1 1 2 3 5 8 13 21))
#(loop [a 1, b 1, xs [] i %] (if (zero? i) xs (recur b (+ a b) (conj xs a) (dec i))))

;; Problem 27, Palindrome Detector
;; https://4clojure.oxal.org/#/problem/27
;; (false? (__ '(1 2 3 4 5)))
;; (true? (__ "racecar"))
;; (true? (__ [:foo :bar :foo]))
;; (true? (__ '(1 1 3 3 1 1)))
;; (false? (__ '(:a :b :c)))
;; patch for strings, converted to a seq of chars
#(= (seq %) (reverse (seq %)))
