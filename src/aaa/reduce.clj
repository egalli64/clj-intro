;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (reduce function [initial-value] collection)

;; accumulate the result processing sequentially the items in the collection
(reduce + 0 [1 2 3 4])                                      ; 10
(reduce + [1 2 3 4])                                        ; 10
(reduce max [3 10 2 1 5])                                   ; 10
