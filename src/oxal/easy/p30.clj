;; Problem 30, Compress a Sequence
;; https://4clojure.oxal.org/#/problem/30
;; (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
;; (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
;; (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))

;; thinking ...
(print "Partition by identity, create groups with same values: ")
(println (partition-by identity [1 1 2 3 3 2 2 3]))
(print "Get just an element (the first) for each group: ")
(println (map first (partition-by identity [1 1 2 3 3 2 2 3])))

(defn remove-duplicates [xs] (map first (partition-by identity xs)))
(println "By function:" (remove-duplicates [1 1 2 3 3 2 2 3]))

;; my solution
(def solution #(map first (partition-by identity %)))

;; verify it
(print "Is the problem solved? ")
(= (apply str (solution "Leeeeeerrroyyy")) "Leroy")
