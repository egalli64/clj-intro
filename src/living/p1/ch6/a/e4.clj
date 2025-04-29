;;; For more info read Living Clojure by Carin Meier
;; channel: go-loop block
(ns living.p1.ch6.a.e4
  (:require [clojure.core.async :as async]))

(def tea-channel (async/chan 10))

(defn -main []
  (async/go-loop []
    (let [val (async/<! tea-channel)]
      (if (= val :cup-x)
        (println "The party is over")
        (do (println "Thanks for" val) (recur)))))

  (println "go-loop ready to consume values in the channel")

  (Thread/sleep 333)
  (async/>!! tea-channel :hot-cup-of-tea)

  (Thread/sleep 333)
  (async/>!! tea-channel :tea-with-sugar)

  (Thread/sleep 333)
  (async/>!! tea-channel :tea-with-milk)

  (Thread/sleep 333)
  (async/>!! tea-channel :cup-x)
  )
