;; Problem 23, Reverse a Sequence
;; https://4clojure.oxal.org/#/problem/23
;; (= (__ [1 2 3 4 5]) [5 4 3 2 1])
;; (= (__ (sorted-set 5 7 2 7)) '(7 5 2))
;; (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

;; thinking ...
(println "reverse works on any seq:")
(println "On vector:" (reverse [:a :b :c]))
(println "On list:" (reverse '(:a :b :c)))
(println "On (array-)map:" (reverse {:a 1 :b 2 :c 3}))
(println "On hash-map (meaningless):" (reverse (hash-map :a 1 :b 2 :c 3)))
(println "On sorted-set:" (reverse (sorted-set :a :b :c)))
(println "On set (meaningless):" (reverse #{:a :b :c}))
(println "On a limited range:" (reverse (range 3)))

;; but we can't use reverse - a simplified implementation:
(let [my-reverse
      (fn [xs] (loop [xs xs, acc nil] (if (empty? xs) acc (recur (rest xs) (conj acc (first xs))))))]
  (println "On vector:" (my-reverse [:a :b :c]))            ; (:c :b :a)
  (println "On list:" (my-reverse '(:a :b :c)))             ; (:c :b :a)
  (println "On (array-)map:" (my-reverse {:a 1 :b 2 :c 3})) ; ([:c 3] [:b 2] [:a 1])
  (println "On sorted-set:" (my-reverse (sorted-set :a :b :c))) ; (:c :b :a)
  (println "On a limited range:" (my-reverse (range 3))))   ; (2 1 0)

;; my solution
(let [solution
      #(loop [xs %, acc nil] (if (empty? xs) acc (recur (rest xs) (conj acc (first xs)))))]
  (print "Is the problem solved? ")
  (and (= (solution [1 2 3 4 5]) [5 4 3 2 1])
       (= (solution (sorted-set 5 7 2 7)) '(7 5 2))
       (= (solution [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]]))
  )
