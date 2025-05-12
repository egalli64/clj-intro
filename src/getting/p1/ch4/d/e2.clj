;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; if-do[-do]

(ns getting.p1.ch4.d.e2)

(defn shipping-charge [preferred-customer order-amount]
  (if preferred-customer
    ;; do more things ...
    (do (println "Preferred customer, free shipping!") 0.0)
    ;; otherwise do other things
    (do (println "Regular customer, charge them for shipping.") (* order-amount 0.10))))

(defn -main []
  (println (shipping-charge true 42))
  (println (shipping-charge false 42)))
