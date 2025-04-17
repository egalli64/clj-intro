;;; For more info read Living Clojure by Carin Meier
;; numeric types
;; 
;; Run it in the REPL, for insstance by: (load-file "src/living/p1/ch1/a/e1.clj")

;; an integer as literal
(println 42)

;; a real number
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

;; (almost) same expression leading to a real number
(let [x (/ 14 35.0)] (println x))
