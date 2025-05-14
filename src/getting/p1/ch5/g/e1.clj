;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; variadic in multi-arity

(ns getting.p1.ch5.g.e1)

(defn one-two-or-more
  ([a] (println "One arg:" a))
  ([a b] (println "Two args:" a b))
  ;; bad! Can't have fixed arity function with more params than variadic function
  ;; ([& more] (println "More than two:" more))
  ;; good
  ([a b & more] (println "More than two:" a b more))
  ;; the first (bad) variadic function is wrong, Clojure don't know if use it or a fixed-arity one
  ;; the second (good) variadic function is right, not ambiguous
  )

(defn -main []
  (one-two-or-more "one")
  (one-two-or-more "one" "two")
  (one-two-or-more "one" "two" "three"))
