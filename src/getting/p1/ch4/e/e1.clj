;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; if "else if" "else"

(ns getting.p1.ch4.e.e1)

;; even if feasible, it is not very readable
(defn shipping-charge [preferred-customer order-amount]
  (if preferred-customer 0.0
    (if (< order-amount 50.0) 5.0
      (if (< order-amount 100.0) 10.0
        (* 0.1 order-amount)))))

(defn -main []
  (println (shipping-charge true 100))
  (println (shipping-charge false 40))
  (println (shipping-charge false 80))
  (println (shipping-charge false 120)))
