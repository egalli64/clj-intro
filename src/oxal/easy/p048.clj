;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Easy 4ever-clojure exercises
;; Problem 48, Intro to some
;; Get the first truthy value, or nil
;; https://4clojure.oxal.org/#/problem/48
;; (= __ (some #{2 7 6} [5 6 7 8]))
;; (= __ (some #(when (even? %) %) [5 6 7 8]))

;; thinking ...

;; 2 causes even? to return true
(println (some even? [1 2 3]))

;; the anon function returns the passed value, if even, nil otherwise
(println (some #(when (even? %) %) [1 2 3]))

;; even return always false here, so nil is returned by some
(println (some even? [1 5 3]))

;; a set could be used as a "predicate", the first matching value is returned
(println (some #{1 2 3} [5 4 3]))
(println (some #{1 2 3} [5 4 6]))

;; a map could be used as a "predicate", the first matching key let its value be returned
(println (some {:a 1, :b 2, :c 3} [:d :e :c]))

;; solution
(let [__ 6]
  (and (= __ (some #{2 7 6} [5 6 7 8]))
       (= __ (some #(when (even? %) %) [5 6 7 8]))))
