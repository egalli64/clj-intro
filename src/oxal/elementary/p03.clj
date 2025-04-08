;; Problem 3, Strings
;; https://4clojure.oxal.org/#/problem/3
;; (= __ (.toUpperCase "hello world")) : "HELLO WORLD"

(println "Invoking a Java instance method")
(= "HELLO WORLD" (.toUpperCase "hello world"))
