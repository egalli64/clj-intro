;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; Accessing items in a rest parameter

(ns getting.p1.ch5.b.e3)

(defn first-argument [x & args]
  (println "Rest arguments are" args)
  ;; return the first item in the rest parameter
  x)

(defn -main []
  (println (first-argument 7 true nil))
  ;; first-argument has arity 1+, next form is wrong
  ;; (println (first-argument))
  )
