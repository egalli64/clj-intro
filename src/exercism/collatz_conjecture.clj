;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Collatz Conjecture: https://exercism.org/tracks/clojure/exercises/collatz-conjecture/
(ns exercism.collatz-conjecture)

;; even? divide by two
;; odd? multiply by three and add one
(defn collatz "Returns the number of steps it takes to reach 1 according to the rules of the Collatz Conjecture."
  [num]
  (loop [count 0, x num]
    (if (= 1 x) count (recur (inc count) (if (even? x) (/ x 2) (inc (* x 3)))))))
