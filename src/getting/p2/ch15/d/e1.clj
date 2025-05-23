;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; spec: def

(ns getting.p2.ch15.d.e1
  (:require [clojure.spec.alpha :as s]))

;; enriched set up of global registry
(s/def ::title string?)
(s/def ::author string?)
(s/def ::copies int?)
(s/def ::book (s/keys :req-un [::title ::author ::copies]))

;; check a book
(s/valid? ::book {:title "Dracula" :author "Stoker" :copies 10})
(s/valid? ::book {:title 1234 :author false :copies "many"})
