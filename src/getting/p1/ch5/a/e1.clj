;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; a multi-arity function

(ns getting.p1.ch5.a.e1)

(defn greet
  ;; arity 1
  ([to-whom] (println "Welcome to Flourish and Blotts" to-whom))
  ;; arity 2
  ([message to-whom] (println message to-whom)))

(defn -main []
  (greet "Dolly")
  (greet "Howdy" "Stranger"))