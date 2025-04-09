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
