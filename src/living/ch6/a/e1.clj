;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; channel: synchronous put >!! and take <!!

(ns living.ch6.a.e1
  (:require [clojure.core.async :as async]))

;; a buffered channel sized 10
(def tea-channel (async/chan 10))

(defn -main []
  (println "Async put on channel..." (async/>!! tea-channel :cup-1))
  (println "Async take on channel..." (async/<!! tea-channel))

  ;; put a few values on the channel
  (println "Async put on channel... (x3)"
           (async/>!! tea-channel :cup-1)
           (async/>!! tea-channel :cup-2)
           (async/>!! tea-channel :cup-3))

  ;; take works alright on a closed channel
  ;; but when it is empty, it returns nil
  (dotimes [_ 3] (println "Async take on channel..." (async/<!! tea-channel)))

  ;; uncomment next line to hang forever on an empty channel
  ;; (async/<!! tea-channel)
  )

