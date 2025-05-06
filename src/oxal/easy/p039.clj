;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Easy 4ever-clojure exercises
;; Problem 39, Interleave Two Seqs
;; Write a function that interleaves two seqs
;; https://4clojure.oxal.org/#/problem/39
;; (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
;; (= (__ [1 2] [3 4 5 6]) '(1 3 2 4))
;; (= (__ [1 2 3 4] [5]) [1 5])
;; (= (__ [30 20] [25 15]) [30 25 20 15])

;; thinking ...
(println (interleave [1 2 3] [:a :b :c]))                   ; (1 :a 2 :b 3 :c)
(println (interleave [1 2 3 4] [5]))                        ; (1 5)

;; but interleave is not an acceptable solution ...

;; map the two seq in a vector, getting a seq of vectors
;; apply concat to concat each vector in the same seq
(println (apply concat (map vector [1 2 3] [:a :b :c])))

;; as function
(let [my-interleave (fn [xs ys] (apply concat (map vector xs ys)))]
  (println (my-interleave [1 2 3] [:a :b :c]))
  )

;; solution
(let [__ #(apply concat (map vector %1 %2))]
  (and (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
       (= (__ [1 2] [3 4 5 6]) '(1 3 2 4))
       (= (__ [1 2 3 4] [5]) [1 5])
       (= (__ [30 20] [25 15]) [30 25 20 15])))
