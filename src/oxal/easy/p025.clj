;; Problem 25, Find the odd numbers
;; https://4clojure.oxal.org/#/problem/25
;; (= (__ #{1 2 3 4 5}) '(1 3 5))
;; (= (__ [4 2 1 6]) '(1))
;; (= (__ [2 2 4 6]) '())
;; (= (__ [1 1 1 3]) '(1 1 1 3))

;; thinking ...
(println "filter works on any seq:")
(println "On vector:" (filter odd? [1 2 3]))
(println "On list:" (filter odd? '(1 2 3)))
(println "On set:" (filter odd? #{1 2 3}))
(println "On a limited range:" (filter odd? (range 4)))

;; my solution
(let [solution #(filter odd? %)]
  (print "Is the problem solved? ")
  (and (= (solution #{1 2 3 4 5}) '(1 3 5))
       (= (solution [4 2 1 6]) '(1))
       (= (solution [2 2 4 6]) '())
       (= (solution [1 1 1 3]) '(1 1 1 3))))
