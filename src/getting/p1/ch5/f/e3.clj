;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; postcondition by :post

(ns getting.p1.ch5.f.e3)

(defn publish-book [book]
  ;; meaning: the function must return a boolean
  {:post [(boolean? %)]}
  (println "mock printing of" book)
  (println "mock shipping of" book)
  ;; only if book contains :title the postcondition is satisfied
  (when (:title book) true))

(defn -main []
  (println (publish-book {:title "Something else"}))
  (try (println (publish-book {:unexpectedly "Bad"}))
       (catch AssertionError e (println (.getMessage e)))))
