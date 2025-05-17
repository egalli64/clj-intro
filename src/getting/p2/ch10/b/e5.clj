;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; using rest to count the elements in any collection

(defn my-count [coll]
  (loop [n 0, s coll]
    (if (seq s) (recur (inc n) (rest s)) n)))

(def titles ["Emma" "Oliver Twist" "Robinson Crusoe"])
(count titles)
(my-count [])
(my-count titles)
