;; Problem 22, Count a Sequence
;; https://4clojure.oxal.org/#/problem/22
;; (= (__ '(1 2 3 3 1)) 5)
;; (= (__ "Hello World") 11)
;; (= (__ [[1 2] [3 4] [5 6]]) 3)
;; (= (__ '(13)) 1)
;; (= (__ '(:a :b :c)) 3)

;; thinking ...
(println "count can be invoked only on Counted objects")
(println "vector:" (count [:a :b :c]))
(println "list:" (count '(:a :b :c)))
(println "map:" (count {:a 1 :b 2 :c 3}))
(println "set:" (count #{:a :b :c}))
(println "string:" (count "abc"))
(println "nil:" (count nil))

;; lazy seq could give troubles
(println "a vector is Counted?" (instance? clojure.lang.Counted []))
(println "a lazy seqs is Counted?" (instance? clojure.lang.Counted (map inc [1])))
(println "count a realized lazy seq from mapping:" 
    (count (map inc [1 2 3])))
;; (println "this takes infinite time:" (count (range)))

;; simplified implementation
(defn my-count [xs]
    (loop [xs xs, acc 0]
        (if (empty? xs)
            acc
            (recur (rest xs) (inc acc)))))

(println "vector:" (my-count [:a :b :c]))
(println "list:" (my-count '(:a :b :c)))
(println "map:" (my-count {:a 1 :b 2 :c 3}))
(println "set:" (my-count #{:a :b :c}))
(println "string:" (my-count "abc"))
(println "nil:" (my-count nil))

;; my solution
(def solution #(loop [xs % acc 0]
    (if (empty? xs)
        acc
        (recur (rest xs) (inc acc)))
))

(print "Is the problem solved? ")
(= (solution '(13)) 1)
