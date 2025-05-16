;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; A Clojure file meant to generate a standalone app

;; the namespace must match the file name
;; the :gen-class keyword is meant to signal the build tool that there are Java dependencies (to generate a jar)
(ns getting.p1.ch9.c.e1
  (:gen-class))

(defn -main "A minimal app" [] (println "Hello, World!"))
