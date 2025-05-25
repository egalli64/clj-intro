;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; Java external package (Gson)
;; Gson should be among the dependencies in deps.edn

(ns getting.p3.ch16.e.e1
  (:import com.google.gson.Gson))

(def gson (Gson.))

(.toJson gson {:title "1984" :author "Orwell"})
