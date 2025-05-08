;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Easy 4ever-clojure exercises
;; Problem 62, Re-implement Iteration
;; Create a lazy infinite seq from a function and an initial value
;; https://4clojure.oxal.org/#/problem/62
;; (= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16])
;; (= (take 100 (__ inc 0)) (take 100 (range)))
;; (= (take 9 (__ #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))

;; thinking ...
;; we can't use iterate, that is exactly what we need
(take 10 (iterate inc 0))

;; it should be recursive and generate a lazy-seq
(letfn [(my-it [func x] (lazy-seq (cons x (my-it func (func x)))))]
  (take 10 (my-it inc 0))
  )

;; solution
(let [__ (fn __ [func x] (lazy-seq (cons x (__ func (func x)))))]
  (and (= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16])
       (= (take 100 (__ inc 0)) (take 100 (range)))
       (= (take 9 (__ #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))))
