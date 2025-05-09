;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (count collection)
;; number of items in a collection

;; any collection supports it
;; but it is a O(n) algorithm for lists and lazy seq
(count [:a :b :c :d :e])
(count '(:a :b :c :d :e))
(count {:a 1 :b 2 :c 3 :d 4 :e 5})
(count #{:a :b :c :d :e})
(count "hello")

;; nil is considered as an empty list
(count nil)

;; counting a lazy seq force its realization
(count (map inc [1 2 3]))

;; to check if a collection is empty use empty? (or seq) instead
(empty? nil)
(not (seq nil))
