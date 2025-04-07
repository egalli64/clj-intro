;;; Running a Clojure app (a script with an entry point: -main)
;;; From CLI (top folder in the repository - assuming src as source folder): clj -M -m brave.p1.e2
;; by default src/ is in the classpath - check it by running: clj -Spath
;;
;; -M tells Clojure _not_ to start the REPL to run the script
;; -m tells Closure the namespace that contains the -main to be executed
;; notice that in Clojure the program entry point is called -main (to avoid conflicts with Java main)
;
;;; Or, start the script runner: clj -M
;; user=> (require 'p1.e2)
;; user=> (in-ns 'p1.e2)
;; user=> (-main) 
;; or - without changing namespace by in-ns - user=> (p1.e2/-main)
(ns brave.p1.e2)

;; The function -main, defined in the namespace a.e2, takes no argument and print a string and return nil
(defn -main [] (println "Hello from a namespaced script!"))
