;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Easy 4ever-clojure exercises
;; Problem 38, Maximum value
;; Write a function with a variable number of parameters returning the maximum value
;; https://4clojure.oxal.org/#/problem/38
;; (= (__ 1 8 3 4) 8)
;; (= (__ 30 20) 30)
;; (= (__ 45 67 11) 67)

;; thinking ...
(println (max 1 42 2))                                      ; 42
(println (max 42))                                          ; 42
;; max-key applies the function passed to its other parameters, returning the one mapping to the highest value
(println (max-key identity 1 42 2))                         ; 42

;; but max and max-keys are not an acceptable solution ...
(let [my-max (fn [& more] (reduce (fn [x y] (if (> x y) x y)) more))]
  (println (my-max 1 2 3))
  )

;; solution
(let [solution (fn [& more] (reduce (fn [x y] (if (> x y) x y)) more))]
  (print "Is the problem solved? ")
  (and (= (solution 42) 42)
       (= (solution 1 8 3 4) 8)
       (= (solution 30 20) 30)
       (= (solution 45 67 11) 67)))
