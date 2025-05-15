;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; let without fn

;; map user to discount
(def user-discounts {"Nick" 0.10 "Jon" 0.07 "Lee" 0.05})

;; the function now get the key and the discount map instead of the discount
;; the code is getting more obscure, but it still works alright
(defn compute-discount-amount [amount user-name user-discounts min-charge]
  (let [
        ;; extract the actual discount from the map
        discount-percent (user-discounts user-name)
        discount (* amount discount-percent)
        discounted-amount (- amount discount)]
    (if (> discounted-amount min-charge) discounted-amount min-charge)))

(compute-discount-amount 100 "Nick" user-discounts 10)
(compute-discount-amount 100 "Jon" user-discounts 10)
(compute-discount-amount 100 "Lee" user-discounts 10)
