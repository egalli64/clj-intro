;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; precondition: the hard way

(ns getting.p1.ch5.f.e1
  (:import (clojure.lang ExceptionInfo)))

(defn publish-book [book]
  (when-not (contains? book :title)
    (throw (ex-info "Books must contain :title" {:book book})))
  (println "mock printing of" book)
  (println "mock shipping of" book))

(defn -main []
  (publish-book {:title "Something else"})
  (try (publish-book {:unexpectedly "Bad"})
       (catch ExceptionInfo e (println (.getMessage e)))))
