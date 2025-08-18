;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (flatten seq) recursively flatten nested sequences into a single sequence
;; notice that it won't flatten maps, set, strings ... just list? and sequential?

;; flattening different kinds of sequences
(= (flatten [1 [2 3] [4 [5]]]) (flatten '(1 (2 3) (4 (5)))) (flatten [[[1] 2] [3 [4 [5]]]])
   [1 2 3 4 5 6])
;; do not flatten set, map string, ...
(= (flatten [1 '(2) #{3} [4 {:a 5}] "hello"])
   [1 2 #{3} 4 {:a 5} "hello"])
;; empty collections are removed
(= (flatten [1 [] [2 []] [[3]] []])
   [1 2 3])
;; but nil are seen just any other atomic value
(= (flatten [1 nil [2 nil] [[3]] nil])
   [1 nil 2 nil 3 nil])
;; single level seq, no change
(= (flatten [1 2 3 4]) (flatten '(1 2 3 4))
   [1 2 3 4])

;; flatten is same as concat, when on single level
(= (concat [1 2] [3 4] [5 6]) (flatten [[1 2] [3 4] [5 6]])
   '(1 2 3 4 5 6))
