;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; standalone CLI app - but I use deps.edn (not Leiningen)
;; in deps.edn: :aliases - :build, see https://github.com/clojure/tools.build?tab=readme-ov-file#release-information
;; build.clj - Clojure code to do the job
;;    the uber-file var contains the name of the generated jar, something like "target/my-app.jar"
;;    the uber var, the map passed to b/uber should have the kv :main -> 'getting.p1.ch1.e.e2
;; run from CLI, in the repo root: clj -T:build uber
;;    (being the code in the repo not meant for production, expect some strange output in the build phase)
;; the jar is generated in the target folder
;;    run it by: java -jar target/my-app.jar

;; need to follow the Java conventions: namespace (Java package) and class generation (for the resulting jar)
(ns getting.p1.ch1.e.e2
  (:gen-class))

;; a plain function called by the main function
(defn say-welcome [what]
  (println (str "Welcome to " what "!")))

;; the app main function
(defn -main []
  (say-welcome "Flourish and Blotts"))