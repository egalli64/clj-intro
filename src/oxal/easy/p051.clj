;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Easy 4ever-clojure exercises
;; Problem 51, Advanced Destructuring
;; Understanding destructuring
;; https://4clojure.oxal.org/#/problem/51
;; (= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] __] [a b c d]))

;; thinking ...
;; we want to get a vector containing two values, a vector, and a second vector with all the previous values
;; the second vector could the destructured collection itself - by :as in destructuring
(let [[:as x] [1 2 3 4 5]] x)
;; the two initial values are the two values in the destructured vector
(let [[a b] [1 2 3 4 5]] [a b])
;; the first vector is the rest of the destructured vector
(let [[_ _ & x] [1 2 3 4 5]] x)

;; the destructured vector could be expressed by range
(range 1 6)

;; solution
(let [__ (range 1 6)]
  (= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] __] [a b c d])))
