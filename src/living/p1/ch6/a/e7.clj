;;; For more info read Living Clojure by Carin Meier
;; standalone CLI app - using deps.edn (not Leiningen)
;; in deps.edn: :aliases - :build, see https://github.com/clojure/tools.build?tab=readme-ov-file#release-information
;; build.clj - Clojure code to do the job
;; run from CLI, in the repo root: clj -T:build uber
;;    (being the code in the repo not meant for production, expect some strange output in the build phase)
;; the jar is generated in the target folder
;;    run it by: java -jar target/tea-app.jar

(ns living.p1.ch6.a.e7
  ;; support to the interaction with Java (for jar generation)
  (:gen-class)
  (:require [clojure.core.async :as async]))

(def channel-a (async/chan 10))
(def channel-b (async/chan 10))
;; the result channel
(def channel-x (async/chan 10))

(defn mock-task "take some random time to be executed" []
  (reduce + (repeat (rand-int 100000) 1)))

(defn request-tea []
  (async/go (async/>! channel-a (str "tea compliments of A - " (mock-task))))
  (async/go (async/>! channel-b (str "tea compliments of B - " (mock-task))))

  (async/go (let [[value] (async/alts! [channel-a channel-b])]
              ;; put the value from the winner channel in the result channel
              (async/>! channel-x value))))

(defn -main []
  (println "Requesting tea")
  (request-tea)
  ;; sync take from the result channel
  (println "The response is:" (async/<!! channel-x)))
