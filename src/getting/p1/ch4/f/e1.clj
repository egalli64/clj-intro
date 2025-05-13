;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; ex-info ExceptionInfo

(ns getting.p1.ch4.f.e1
  (:import (clojure.lang ExceptionInfo)))

(defn publish-book [book]
  (when (not (:title book))
    (throw (ex-info "A book needs a title!" {:book book})))

  ;; Lots of publishing stuff...
  (println "Simulating book publishing for" (:title book)))

(defn -main []
  (publish-book {:title "The evolution man"})
  (try (publish-book {:author "Unknown"})
       (catch ExceptionInfo e (println e)))
  ;; after no-exception or exception caught
  (println "... blah blah blah"))
