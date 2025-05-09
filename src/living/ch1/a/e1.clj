;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; numeric types

;; an integer as literal
(println 42)

;; a double
(println 42.23)

;; a ratio
(println 3/7)

;; a ratio, reduced to integer
(println 35/7)

;; a ratio, simplified
(println 7/35)

;; an invalid number
;; (println 4.0/2)

;; an expression leading to a ratio
(let [x (/ 14 35)] (println x))

;; (almost) same expression leading to a double number
(let [x (/ 14 35.0)] (println x))
