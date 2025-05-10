;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Java interop: import, invoking a static method

(ns living.ch4.a.e2
  (:import (java.net InetAddress)
           (java.util UUID)))

;; slash for static methods
(let [local (InetAddress/getByName "localhost")]
  (println "The object InetAddress:" local)
  (println "The host name:" (.getHostName local)))

;; same, using fully qualified class name instead od import
(let [local (java.net.InetAddress/getByName "localhost")]
  (println "The object InetAddress:" local)
  (println "The host name:" (.getHostName local)))

;; another example, generate a UUID
(println (.toString (UUID/randomUUID)))
