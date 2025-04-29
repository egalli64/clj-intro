;;; For more info read Living Clojure by Carin Meier
;; channel: async put >! and take <! in a go block
(ns living.p1.ch6.a.e3
  (:require [clojure.core.async :as async]))

(defn -main []
  (let [tea-channel (async/chan)]
    ;; channel async put
    ;; the go block, manages the non-blocking asynchronous channel operations
    (async/go (async/>! tea-channel :cup-of))

    ;; async take
    ;; the go block, manages the non-blocking asynchronous channel operations
    (async/go (println "Thanks for the" (async/<! tea-channel))))

  (println "Doing something time consuming in the main thread")
  (Thread/sleep 100)

  (println "Done"))