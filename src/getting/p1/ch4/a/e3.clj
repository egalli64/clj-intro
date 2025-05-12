;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; Using the value returned by an if expression

(ns getting.p1.ch4.a.e3)

(defn shipping-charge [preferred-customer order-amount]
  ;; the value returned by if is returned to the called
  (if preferred-customer 0.00 (* order-amount 0.10)))

(defn -main []
  (println (shipping-charge false 100))
  (println (shipping-charge true 100)))
