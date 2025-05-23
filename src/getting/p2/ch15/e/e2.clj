;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; spec: conform

(ns getting.p2.ch15.e.e2
  (:require [clojure.spec.alpha :as s]))

(def s-n-s-n (s/cat :s1 string? :n1 number? :s2 string? :n2 number?))

;; it is valid, but ... can I have more info about it?
(s/valid? s-n-s-n ["Emma" 1815 "Jaws" 1974])
;; sure!
(s/conform s-n-s-n ["Emma" 1815 "Jaws" 1974])

;; conform is pretty useless for non-conforming values
(s/valid? s-n-s-n [2001 1968 1984 1949])
(s/conform s-n-s-n [2001 1968 1984 1949])
