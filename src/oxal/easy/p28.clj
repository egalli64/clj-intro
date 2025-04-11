;; Problem 28, Flatten a Sequence
;; https://4clojure.oxal.org/#/problem/28
;; (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)) : flatten
;; (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))      : flatten
;; (= (__ '((((:a))))) '(:a))                   : flatten

;; elaborating on the theme
(println "flatten works recursively on any sequential")
(println "On list of vectors:" (flatten '(1 [2 3] [4 [5 6]])))
;; beware of quotes!
(println "On list of vectors and lists:" (flatten (list 1 [2 3] [4 (list 5 6)])))
;; strings are treated naturally since 1.12
(println "On vector of strings:" (flatten ["Hi" ["Tom", "Bob"]]))

(print "Is the actual problem solved? ")
(= (flatten '((((:a))))) '(:a))
