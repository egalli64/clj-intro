;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; precondition by :pre

(ns getting.p1.ch5.f.e2)

(defn publish-book [book]
  {:pre [(:title book)]}
  (println "mock printing of" book)
  (println "mock shipping of" book))

(defn -main []
  (publish-book {:title "Something else"})
  (try (publish-book {:unexpectedly "Bad"})
       (catch AssertionError e (println (.getMessage e)))))
