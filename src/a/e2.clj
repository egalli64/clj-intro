;;; Running a Clojure app (a script with an entry point: -main)
;;; From CLI (top folder in the repository - assuming src as source folder): clj -M -m a.e2
;; -M tells Clojure _not_ to start the REPL to run the script
;; -m tells Closure the namespace that contains the -main to be executed
;; notice that in Clojure the program entry point is called -main (to avoid conflicts with Java main)
;
;;; Or, REPL: clj -M
;; user=> (require 'a.e2)
;; user=> (in-ns 'a.e2)
;; user=> (-main) 
;; or - without changing namespace by in-ns - user=> (a.e2/-main)
(ns a.e2)

;; The function -main, defined in the namespace a.e2, takes no argument and print a string and return nil
(defn -main [] (println "Hello from a namespaced script!"))
