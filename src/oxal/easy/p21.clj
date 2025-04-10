;; Problem 21, Nth Element
;; https://4clojure.oxal.org/#/problem/21
;; (= (__ '(4 5 6 7) 2) 6)               : nth
;; (= (__ [:a :b :c] 0) :a)              : nth
;; (= (__ [1 2 3 4] 1) 2)                : nth
;; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6]) : nth


;; elaborating on the theme
(println "nth expects an indexed collection")
(println "On a vector:", (nth [:a :b :c] 2))
(println "On a list (slow):", (nth '(:a :b :c) 2))
(println "On a string:", (nth "abc" 2))

;; nth is not available on non-indexed collections
(try
    (nth #{:a :b :c} 2)
    (catch UnsupportedOperationException e (println (.getMessage e)))
)

;; fallback to avoid IndexOutOfBoundsException
(println "With fallback:", (nth [:a :b :c] 42 "not found"))
(try
    (nth [:a :b :c] 42)
    (catch Exception e (println "No fallback:" (type e)))
)

(print "Is the actual problem solved? ")
(= (nth '(4 5 6 7) 2) 6)
