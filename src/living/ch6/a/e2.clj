;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; channel: close

(ns living.ch6.a.e2
  (:require [clojure.core.async :as async]))

(def tea-channel (async/chan 10))

(defn -main []
  (println "Async put on channel..." (async/>!! tea-channel :cup))

  ;; nil can't be put on a channel
  (try
    (async/>!! tea-channel nil)
    (catch Exception e (println (.getSimpleName (.getClass e)) (.getMessage e))))

  ;; close the channel
  (println "Close the channel..." (async/close! tea-channel))

  ;; can't put a value in a closed channel
  (println "Put on closed channel..." (async/>!! tea-channel :cup-x))

  ;; take works alright on a closed channel
  ;; but when it is empty, it returns nil
  (dotimes [_ 2] (println "Async take on channel..." (async/<!! tea-channel))))
