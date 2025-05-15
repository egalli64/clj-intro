;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; let

(defn compute-discount-amount [amount discount-percent min-charge]
  ;; more local bindings could be created in a let form
  (let [discount (* amount discount-percent)
        ;; a binding could be used as soon as it is established
        discounted-amount (- amount discount)]
    ;; using the local bindings
    (println (str "Discount: " discount ", discounted amount " discounted-amount))
    (if (> discounted-amount min-charge) discounted-amount min-charge)))

;; usually the customer gets a discount
(compute-discount-amount 100 0.03 10)
;; on small amount min charge wins against discounted amount
(compute-discount-amount 10 0.03 10)
