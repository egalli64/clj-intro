;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (reduce function [initial-value] collection)

;; accumulate the result processing sequentially the items in the collection
(reduce + 0 [1 2 3 4])                                      ; 10
(reduce + [1 2 3 4])                                        ; 10
(reduce max [3 10 2 1 5])                                   ; 10

;; simulate map function by reduce - generate a new vector with original values doubled
(reduce (fn [acc x] (conj acc (* 2 x))) [] [1 2 3 4])
