;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; A namespace requiring another namespace

(ns getting.p1.ch9.c.e3
  ;; notice that here require is a keyword, and the namespace required must not be quoted
  (:require getting.p1.ch9.c.e2)
  (:gen-class))

(defn -main []
  (println (getting.p1.ch9.c.e2/discount-price {:title "Emma" :price 9.99})))
