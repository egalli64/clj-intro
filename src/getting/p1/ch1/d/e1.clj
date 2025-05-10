;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; defn: bind a symbol to a function

;; bind hello-world to a function taking no argument (arity 0)
(defn hello-world [] (println "Hello, world!"))
(hello-world)

;; a function taking one argument (arity 1)
(defn say-welcome [what]
  (println "Welcome to" what))
(say-welcome "Clojure")

;; a function with two arguments (no comma as separator) that returns a value
(defn average [a b]
  ;; the last expression in the function generates the return value
  (/ (+ a b) 2.0))
;; it should return 7.5
(average 5 10)

;; uncomment next line to get a ClassCastException
;; (average :a :b)
