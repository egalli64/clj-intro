;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Java interop: class, invoking an instance method, creating a new object

(def user "Timothy")

;; the _class_ function gives the (Java) class of the passed object
(println "Get the class of an object:" user (class user))

;; invoking an instance method
(println "Uppercase (. obj method):" (. user toUpperCase))
(println "Uppercase (.method obj):" (.toUpperCase user))

;; invoking an instance method with arguments
(println "Index of (.method obj arg):" (.indexOf user "ot"))

;; new object
(println "Generating a new object (classname. arg):" (String. "hello!"))
