;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; other predicates to compare numbers

(def a 42)
(def b 24)
(def c 99)

(if (> a b)
  (println "a is bigger than b"))

(if (>= a b)
  (println "a is bigger or equal to b"))


(if (< b c)
  (println "b is smaller than c"))

(if (<= b c)
  (println "b is smaller or equal to c"))
