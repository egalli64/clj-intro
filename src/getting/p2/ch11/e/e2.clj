;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; a simplified repeat

;; get a value in input
;; build a seq from it by cons on a lazy-seq built calling recursively the same function on the same value
(defn my-repeat [x]
  (cons x (lazy-seq (my-repeat x))))

(take 3 (my-repeat "hello"))
(take 3 (repeat "hello"))
