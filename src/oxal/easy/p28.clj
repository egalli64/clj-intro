;; Problem 28, Flatten a Sequence
;; https://4clojure.oxal.org/#/problem/28
;; (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
;; (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
;; (= (__ '((((:a))))) '(:a))

;; thinking ...
(println "flatten works recursively on any sequential")
(println "On list of vectors:" (flatten '(1 [2 3] [4 [5 6]])))
;; beware of quotes!
(println "On list of vectors and lists:" (flatten (list 1 [2 3] [4 (list 5 6)])))
;; strings are treated naturally since 1.12
(println "On vector of strings:" (flatten ["Hi" ["Tom", "Bob"]]))

(defn my-flatten [x]
   (if (sequential? x)
     (mapcat my-flatten x)
     [x]))
(println (my-flatten '(1 [2 3] [4 [5 6]])))
(println (my-flatten (list 1 [2 3] [4 (list 5 6)])))
(println (my-flatten ["Hi" ["Tom", "Bob"]]))

;; my solution
(def solution (fn fltn [x]
   (if (sequential? x)
     (mapcat fltn x)
     [x])))

(print "Is the problem solved? ")
(= (solution '((((:a))))) '(:a))
