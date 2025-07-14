;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Vector - implemented with a trie, almost constant access O(log32 n), weak point: prepending, O(n)

;; a PersistentVector - by literal syntax
(type [1 2 3])

;; create a vector by constructor function
(vector 1 2 3)

;; coerce a seq to a vector by conversion function
(vec '(1 2 3))
;; or, use the more flexible into
(into [] '(1 2 3))

;; the elements are ordered by index (zero based)
(nth [1 2 3] 2)

;; a vector can be heterogeneous
[1 "two" :three {:four 4} [:five "five" 5] nil]

;;
;; Common operations on vector

;; append
(conj [1 2 3] 4)
;; update by index
(assoc [1 2 3] 1 20)
;; remove last element
(pop [1 2 3])
;; get last element
(peek [1 2 3])
;; count elements
(count [1 2 3])
;; get first element
(first [1 2 3])
;; get the rest - discard the first element
(rest [1 2 3])
;; we can use map to extract values from a vector by index
(map [10 20 30 40] [0 2 1])
