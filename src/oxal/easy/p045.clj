;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Easy 4ever-clojure exercises
;; Problem 45, Intro to Iterate
;; Understand iterate
;; https://4clojure.oxal.org/#/problem/45
;; (= __ (take 5 (iterate #(+ 3 %) 1)))

;; thinking ...
;; iterate generates an infinite lazy seq from the passed value and the function passed

;; all the integers having modulo 3 is 1
(take 5 (iterate #(+ 3 %) 1))
;; all ones
(take 5 (iterate identity 1))

;; solution
(let [__ '(1 4 7 10 13)]
  (= __ (take 5 (iterate #(+ 3 %) 1))))
