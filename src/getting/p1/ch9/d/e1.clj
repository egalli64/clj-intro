;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; aliasing a required namespace by :as

(ns getting.p1.ch9.d.e1
  (:require [getting.p1.ch9.c.e2 :as pricing])
  (:gen-class))

(defn -main "A minimal app" [] (println (pricing/discount-price {:title "Emma" :price 9.99})))
