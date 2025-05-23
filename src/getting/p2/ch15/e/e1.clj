;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; spec: explain

(ns getting.p2.ch15.e.e1
  (:require [clojure.spec.alpha :as s]))

;; enriched set up of global registry
(s/def ::title string?)
(s/def ::author string?)
(s/def ::copies int?)
(s/def ::book (s/keys :req-un [::title ::author ::copies]))

;; checking a malformed book and getting just "false" is kind of disappointing
(s/valid? ::book {:author :austen :title :emma})

;; consider this spec
(def n-gt-10 (s/and number? #(> % 10)))
;; spec: explain gives more satisfaction
(s/explain n-gt-10 44)
;; ... especially in case of rejection
(s/explain n-gt-10 1)

;; on a more complex spec we get a full report of all the failure reasons
(s/explain ::book {:author :austen :title :emma})
