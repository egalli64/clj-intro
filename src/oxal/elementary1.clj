;; Problem 3, Strings
;; https://4clojure.oxal.org/#/problem/3
;; (= __ (.toUpperCase "hello world"))
"HELLO WORLD"

;; Problem 4, Lists
;; https://4clojure.oxal.org/#/problem/4
;; (= (list __) '(:a :b :c))
:a :b :c

;; Problem 5, conj on lists
;; https://4clojure.oxal.org/#/problem/5
;; (= __ (conj '(2 3 4) 1))
;; (= __ (conj '(3 4) 2 1))
'(1 2 3 4)

;; Problem 6, Vectors
;; https://4clojure.oxal.org/#/problem/6
;; (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
:a :b :c

;; Problem 7, conj on vectors
;; https://4clojure.oxal.org/#/problem/7
;; (= __ (conj [1 2 3] 4))
;; (= __ (conj [1 2] 3 4))
[1 2 3 4]

;; Problem 8, Sets
;; https://4clojure.oxal.org/#/problem/8
;; (= __ (set '(:a :a :b :c :c :c :c :d :d)))
;; (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))
;; to use set/union: (require '[clojure.set :as set])
#{:a :b :c :d}

;; Problem 9, conj on sets
;; https://4clojure.oxal.org/#/problem/9
;; (= #{1 2 3 4} (conj #{1 4 3} __))
2
