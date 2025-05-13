;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; Accessing items in a rest parameter

(ns getting.p1.ch5.b.e2)

(defn first-argument [& args]
  ;; return the first item in the rest parameter
  (first args))

(defn -main []
  (println (first-argument 7 true nil))
  ;; no argument passed, so first element is nil
  (println (first-argument)))
