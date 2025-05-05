;; Problem 28, Flatten a Sequence
;; https://4clojure.oxal.org/#/problem/28
;; (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
;; (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
;; (= (__ '((((:a))))) '(:a))

;; thinking ...
(println "flatten works recursively on any sequential")
(println "On list of vectors:" (flatten '(1 [2 3] [4 [5 6]]))) ; (1 2 3 4 5 6)
;; beware of quotes!
(println "On list of vectors and lists:" (flatten (list 1 [2 3] [4 (list 5 6)])))
;; strings are treated naturally since 1.12
(println "On vector of strings:" (flatten ["Hi" ["Tom", "Bob"]])) ; (Hi Tom Bob)

;; use sequential? to ensure a collection is a sequential
(println "Is vector a sequential?" (sequential? []))
(println "Is set a sequential?" (sequential? #{}))

;; mapcat is roughly the same as (apply concat (map f coll))
(println (mapcat (fn [x] [x x]) [1 2 3]))                   ; (1 1, 2 2, 3 3)
;; notice that [] as return value in a #() are not understood by the compiler
;; (println (mapcat #([% %]) [1 2 3]))
(println (mapcat range [3 2 1]))                            ; (0 1 2, 0 1, 0)

;; my solution
(let [solution (fn my-flatten [x] (if (sequential? x) (mapcat my-flatten x) [x]))]
  (print "Is the problem solved? ")
  (and (= (solution '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
       (= (solution ["a" ["b"] "c"]) '("a" "b" "c"))
       (= (solution '((((:a))))) '(:a))))
