;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; an idiomatic multi-arity function, the highest arity one does the actual job

(ns getting.p1.ch5.a.e2)

(defn greet
  ;; arity 1 calls arity 2
  ([to-whom] (greet "Welcome to Flourish and Blotts" to-whom))
  ;; arity 2 does the actual job
  ([message to-whom] (println message to-whom)))

(defn -main []
  (greet "Dolly")
  (greet "Howdy" "Stranger"))