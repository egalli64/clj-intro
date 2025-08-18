;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (remove predicate seqable)

(= '(:a :b :c) (remove nil? [:a nil :b nil :c]))
(= '(1 3 5) (remove even? [1 2 3 4 5]))
(= '(1 2 3) (remove #(< % 0) [1 -1 2 3 -2]))
