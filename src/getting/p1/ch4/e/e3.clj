;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; cond :else to check multiple conditions

(ns getting.p1.ch4.e.e3)

(defn shipping-charge [preferred-customer order-amount]
  (cond
    ;; if the predicate is true, return the associated value
    preferred-customer 0.0
    ;; else if ...
    (< order-amount 50.0) 5.0
    ;; else if ...
    (< order-amount 100.0) 10.0
    ;; :else is truthy (as everything but false and nil, but it is idiomatic)
    :else (* 0.1 order-amount)))

(defn -main []
  (println (shipping-charge true 100))
  (println (shipping-charge false 40))
  (println (shipping-charge false 80))
  (println (shipping-charge false 120)))
