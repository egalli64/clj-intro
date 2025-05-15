;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; let fn

;; map user to discount
(def user-discounts {"Nick" 0.10 "Jon" 0.07 "Lee" 0.05})

;; generate a function to calculate the discount for the passed user
(defn make-discount-price [user-name user-discounts min-charge]
  (let [discount-percent (user-discounts user-name)]
    (fn [amount]
      (let [discount (* amount discount-percent)
            discounted-amount (- amount discount)]
        (if (> discounted-amount min-charge) discounted-amount min-charge)))))

;; generate a specific function to calculate the discounted price for a specific customer
(def compute-lee-price (make-discount-price "Lee" user-discounts 10.0))

;; calculate the discount
(compute-lee-price 100)
