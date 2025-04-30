;;; For more info read Living Clojure by Carin Meier
;; channel: recap

(ns living.p1.ch6.a.e6
  (:require [clojure.core.async :as async]))

;; create two channels
(def channel-a (async/chan 10))
(def channel-b (async/chan 10))

(defn mock-task "take some random time to be executed" []
  (reduce + (repeat (rand-int 100000) 1)))

(defn request-tea []
  ;; async put a value in the channels
  (async/go (async/>! channel-a (str "tea compliments of A - " (mock-task))))
  (async/go (async/>! channel-b (str "tea compliments of B - " (mock-task))))

  ;; async wait on the fastest channel to generate a value
  (async/go (let [[value] (async/alts! [channel-a channel-b])] value)))

(defn -main []
  ;; get a value from the two competing channels
  (println "Result:" (async/<!! (request-tea))))
