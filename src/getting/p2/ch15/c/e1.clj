;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; spec: def

(ns getting.p2.ch15.c.e1
  (:require [clojure.spec.alpha :as s]))

;; global registry
(s/def :getting.p2.ch15.c.e1/book
  (s/keys :req-un
          [:getting.p2.ch15.c.e1/title :getting.p2.ch15.c.e1/author :getting.p2.ch15.c.e1/copies]))

;; validate a map as book
(s/valid? :getting.p2.ch15.c.e1/book {:title "Dracula" :author "Stoker" :copies 10})

;; being in the getting.p2.ch15.c.e1 namespace, a short form could be used to register a spec
(s/def ::book (s/keys :req-un [::title ::author ::copies]))

;; ... and to check it
(s/valid? ::book {:title "Dracula" :author "Stoker" :copies 10})
