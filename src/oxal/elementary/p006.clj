;; Problem 6, Vectors
;; https://4clojure.oxal.org/#/problem/6
;; (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

;; thinking ...
(println "Creating a vector (literal):" '[:a :b :c])
(println "Creating a vector (classic factory):" (vector :a :b :c))
(println "Creating a vector (vec factory):" (vec #{:a :b :c}))

;; my solution
;; :a :b :c

(print "Is the problem solved? ")
(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
