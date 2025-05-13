;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; the & marker

(ns getting.p1.ch5.b.e1)

;; all the arguments are packed in the args parameter, as a seq
(defn print-any-args [& args]
  (println "My arguments are:" args))

(defn -main []
  (print-any-args 7 true nil))
