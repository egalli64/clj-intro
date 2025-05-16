;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; In an app we have many namespaces

;; again, src filename matching with the namespace
(ns getting.p1.ch9.c.e2)

;; these vars are in their specific namespace
(def discount-rate 0.15)
(defn discount-price [book] (- (:price book) (* discount-rate (:price book))))
