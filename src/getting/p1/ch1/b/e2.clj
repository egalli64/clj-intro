;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; Combining arithmetic operations

;; divide by two the sum of 1984 and 2010
(/ (+ 1984 2010) 2)

;; adding more values
(+ 1000 500 500 1)

;; subtracting more values from the first argument
(- 2000 10 4 2)

;; when a single argument is passed act as unary minus, negating the value
(- 42)

;; division do not truncate to int, it returns a ratio instead!
(/ 8 3)

;; if a real number is involved, integers are promoted to match with it
(/ (+ 1984 2010) 2.0)
