;; Problem 16, Hello World
;; https://4clojure.oxal.org/#/problem/16
;; (= (__ "Dave") "Hello, Dave!") : #(str "Hello, " % "!")
;; (= (__ "Jenn") "Hello, Jenn!") : #(str "Hello, " % "!")
;; (= (__ "Rhea") "Hello, Rhea!") : #(str "Hello, " % "!")

;; elaborating on the theme
(defn hello [x] (str "Hello, " x "!"))

(println "Greeting by function")
(println "Calling a def function:" (hello "Tom"))
(println "Calling a fn function:" ((fn [x] (str "Hello, " x "!")) "Tom"))
(println "Calling an anon function:" (#(str "Hello, " % "!") "Tom"))

(print "Is the actual problem solved? ")
(= (#(str "Hello, " % "!") "Rhea") "Hello, Rhea!")
