;;; For more info read Living Clojure by Carin Meier
;; Check the core.async dependency is available
;; see org.clojure/core.async dependency in the project configuration
;; https://github.com/clojure/core.async

(ns living.ch6.e1
  (:require [clojure.core.async :as async]))

(defn -main []
  (println "core.async is required successfully!")
  (let [my-channel (async/chan)]
    (println "Created a channel:" my-channel))
  )
