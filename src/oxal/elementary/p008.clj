;; Problem 8, Sets
;; https://4clojure.oxal.org/#/problem/8
;; (= __ (set '(:a :a :b :c :c :c :c :d :d)))
;; (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))

;; thinking ...
(println "Creating a set (literal):" #{:a :b :c})
(println "Creating a set (factory):" (set [:a :b :c]))

;; the set theory functions must be loaded explicitely
(require '[clojure.set :as set])
(println "Creating a set by union:" (set/union #{:a :b} #{:b :c}))

;; my solution
(def solution #{:a :b :c :d})

(print "Is the problem solved? ")
(= solution (set '(:a :a :b :c :c :c :c :d :d)))
