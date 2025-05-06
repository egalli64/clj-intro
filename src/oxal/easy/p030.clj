;; Problem 30, Compress a Sequence
;; https://4clojure.oxal.org/#/problem/30
;; (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
;; (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
;; (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))

;; thinking ...

;; the identity function, returns the passed value
(println "Identity of 42 is" (identity 42))

;; partition a seq, create groups, splitting when the function changes value
(print "Partition by identity: ")
(println (partition-by identity [1 1 2 3 3 2 2 3]))

;; map each sub seq to an element, picking up only its first one
(let [remove-duplicates (fn [xs] (map first (partition-by identity xs)))]
  (println "Remove duplicates:" (remove-duplicates [1 1 2 3 3 2 2 3])))

;; my solution
(let [solution #(map first (partition-by identity %))]
  (print "Is the problem solved? ")
  (and (= (apply str (solution "Leeeeeerrroyyy")) "Leroy")
       (= (solution [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
       (= (solution [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))))
