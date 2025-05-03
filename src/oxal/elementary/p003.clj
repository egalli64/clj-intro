;; Problem 3, Strings
;; https://4clojure.oxal.org/#/problem/3
;; (= __ (.toUpperCase "hello world"))

;; thinking ...
(println "Invoking the Java instance method length on 'Hello':" (.length "Hello"))
(println "Invoking the Java static method String.valueOf() on Math::sqrt(2):" (String/valueOf (Math/sqrt 2)))
(println "Instantiate a Java object (explicit new):" (new java.util.Date))
(println "Instantiate a Java object (implicit new):" (java.util.Date.))

;; my solution
(def solution "HELLO WORLD")

(print "Is the problem solved? ")
(= solution (.toUpperCase "hello world"))
