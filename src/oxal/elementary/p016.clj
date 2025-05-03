;; Problem 16, Hello World
;; https://4clojure.oxal.org/#/problem/16
;; (= (__ "Dave") "Hello, Dave!")
;; (= (__ "Jenn") "Hello, Jenn!")
;; (= (__ "Rhea") "Hello, Rhea!")

;; thinking ...
(defn hello [x] (str "Hello, " x "!"))

(println "Greeting by function")
(println "Calling a def function:" (hello "Tom"))
(println "Calling a fn function:" ((fn [x] (str "Hello, " x "!")) "Tom"))
(println "Calling an anon function:" (#(str "Hello, " % "!") "Tom"))

;; my solution
(def solution #(str "Hello, " % "!"))

(print "Is the problem solved? ")
(= (solution "Rhea") "Hello, Rhea!")
