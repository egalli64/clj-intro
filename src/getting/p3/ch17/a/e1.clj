;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;;

(ns getting.p3.ch17.a.e1)

;; the task for the thread
(defn do-something-in-a-thread []
  (println "Hello from the thread.")
  (println "Good bye from the thread."))

;; -main is run in the main thread
(defn -main []
  (println "Coming to you live from the main thread!")
  ;; create a thread associated to the given function
  (let [the-thread (Thread. do-something-in-a-thread)]
    ;; start the thread
    (.start the-thread)))
