;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; referring to a var defined in a required namespace by :refer

(ns getting.p1.ch9.d.e2
  (:require [getting.p1.ch9.c.e2 :refer [discount-price]])
  (:gen-class))

(defn -main "A minimal app" [] (println (discount-price {:title "Emma" :price 9.99})))
