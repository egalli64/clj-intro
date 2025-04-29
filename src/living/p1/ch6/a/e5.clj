;;; For more info read Living Clojure by Carin Meier
;; channel: alts!

(ns living.p1.ch6.a.e5
  (:require [clojure.core.async :as async]))

(def tea-channel (async/chan 10))
(def milk-channel (async/chan 10))
(def sugar-channel (async/chan 10))
(def control-channel (async/chan 10))

(defn -main []
  (async/go-loop []
    (let [[value channel] (async/alts! [tea-channel milk-channel sugar-channel control-channel])]
      (println "Got " value " from " channel)
      (if (= val :party-over) (println "The party is over") (recur))))
  (println "go-loop ready to consume values in the channels")

  (Thread/sleep 333)
  (async/>!! sugar-channel :sugar)

  (Thread/sleep 333)
  (async/>!! milk-channel :milk)

  (Thread/sleep 333)
  (async/>!! tea-channel :tea)

  (Thread/sleep 333)
  (async/>!! control-channel :party-over)
  )
