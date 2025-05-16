;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; The current namespace: *ns*

(ns getting.p1.ch9.e.e1)

;; at this point the namespace is determined by the ns form above
(println "Current ns:" *ns*)

(defn -main []
  ;; at this point the namespace is determined by the app configuration
  ;; see deps.edn in :alias :run :main-opts, or Leiningen project.clj :main
  ;; when running as standalone is usually started in the user namespace
  (println "ns in the main function:" *ns*))
