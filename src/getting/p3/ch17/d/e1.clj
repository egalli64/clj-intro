;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; join on a child thread

(ns getting.p3.ch17.d.e1)

(def worker (Thread. #(println "Doing something in another thread")))

(defn -main []
  (println "Starting the main thread")
  (.start worker)

  (println "Joining the worker in the main thread")
  (.join worker)
  (println "Terminating the main thread task"))
