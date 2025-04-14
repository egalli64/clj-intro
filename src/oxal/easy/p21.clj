;; Problem 21, Nth Element
;; https://4clojure.oxal.org/#/problem/21
;; (= (__ '(4 5 6 7) 2) 6)
;; (= (__ [:a :b :c] 0) :a)
;; (= (__ [1 2 3 4] 1) 2)
;; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])

;; thinking ...
(println "nth expects an indexed collection")
(println "On a vector:", (nth [:a :b :c] 2))
(println "On a list (slow):", (nth '(:a :b :c) 2))
(println "On a string:", (nth "abc" 2))

;; nth is not available on non-indexed collections
(try
  (nth #{:a :b :c} 2)
  (catch UnsupportedOperationException e (println (.getMessage e))))

;; fallback to avoid IndexOutOfBoundsException
(println "With fallback:", (nth [:a :b :c] 42 "not found"))
(try
  (nth [:a :b :c] 42)
  (catch Exception e (println "No fallback:" (type e))))

;; a simplified function that works as nth
(let [my-nth (fn [xs n] (if (zero? n) (first xs) (recur (rest xs) (dec n))))]
  (println "On a vector:", (my-nth [:a :b :c] 2))
  (println "On a list:", (my-nth '(:a :b :c) 2))
  (println "On a string:", (my-nth "abc" 2)))

;; my solution
(def solution #(if (zero? %2) (first %1) (recur (rest %1) (dec %2))))

(print "Is the problem solved? ")
(= (solution '(4 5 6 7) 2) 6)