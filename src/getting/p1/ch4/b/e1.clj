;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; Equality testing: = not=

;; Clojure values are (almost always) Java objects
;; the Clojure = function acts like the Java equals() method
(= 1 1)
(= 2 (+ 1 1))
(= "Emma" "Emma")
(not= "Anna Karenina" "Jane Eyre")

;; it is a variadic function
(= (+ 2 2) 4 (/ 40 10) (* 2 2) (- 5 1))
(not= 2 2 2 2 3 2 2 2 2 2)
