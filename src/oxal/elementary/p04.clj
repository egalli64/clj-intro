;; Problem 4, Lists
;; https://4clojure.oxal.org/#/problem/4
;; (= (list __) '(:a :b :c)) : __ is :a :b :c

;; elaborating on the theme
(println "Creating a list (literal):" '(:a :b :c))
(println "Creating a list (ctor):" (list :a :b :c))

;; here Clojure tries to invoke the function :a on the map :b
;; (meaning: get the value associated to the key :a)
;; but :b is not a map so it returns the default value, :c
(println "Do not forget to quote the list ..." (:a :b :c))


(print "Is the actual problem solved? ")
(= (list :a :b :c) '(:a :b :c))
