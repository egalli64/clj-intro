;;; For more info read Living Clojure by Carin Meier
;; Java interop: import, invoking a static method

(ns living.p1.ch4.a.e2
  (:import (java.net InetAddress)))

;; slash for static methods
(let [local (InetAddress/getByName "localhost")]
  (println "The object InetAddress:" local)
  (println "The host name:" (.getHostName local)))

;; same, using fully qualified class name instead od import
(let [local (java.net.InetAddress/getByName "localhost")]
  (println "The object InetAddress:" local)
  (println "The host name:" (.getHostName local)))
