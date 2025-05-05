;; Problem 24, Sum It All Up
;; https://4clojure.oxal.org/#/problem/24
;; (= (__ [1 2 3]) 6)
;; (= (__ (list 0 -2 5 5)) 8)
;; (= (__ #{4 2 1}) 7)
;; (= (__ '(0 0 -1)) -1)
;; (= (__ '(1 10 3)) 14)

;; thinking ...
(println "reduce works on any seq:")
(println "On vector:" (reduce + [1 2 3]))                   ;; 6
(println "On list:" (reduce + '(1 2 3)))
(println "On set:" (reduce + #{1 2 3}))
(println "On a limited range:" (reduce + (range 4)))

(println "On nil:" (reduce + nil))                          ;; 0

;; my solution
;; reduce +

(let [solution #(reduce + %)]
  (print "Is the problem solved? ")
  (and (= (solution [1 2 3]) 6)
       (= (solution (list 0 -2 5 5)) 8)
       (= (solution #{4 2 1}) 7)
       (= (solution '(0 0 -1)) -1)
       (= (solution '(1 10 3)) 14)))
