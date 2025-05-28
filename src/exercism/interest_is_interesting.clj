;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Interest is Interesting https://exercism.org/tracks/clojure/exercises/interest-is-interesting/
(ns exercism.interest-is-interesting)

;; rates for negative, low < medium, medium < high, and high
(def rates {:neg -3.213, :low 0.5, :medium 1.621, :high 2.475})
;; fences between low and medium, and medium and high
(def limits {:medium 1000, :high 5000})

(defn interest-rate
  "Returns the interest rate based on the specified balance. (double)"
  [balance]
  (cond (< balance 0) (:neg rates)
        (< balance (:medium limits)) (:low rates)
        (< balance (:high limits)) (:medium rates)
        :else (:high rates)))

(defn annual-balance-update
  "Returns the annual balance update, taking into account the interest rate. (bigdec)"
  [balance] (+ balance (* (bigdec (^[double] Math/abs (interest-rate balance))) balance 1/100)))

;; donation is two times the percentage on the balance truncated to integer (if positive)
(defn amount-to-donate
  "Returns how much money to donate based on the balance and the tax-free percentage. (int)"
  [balance tax-free-percentage]
  (if (> balance 0) (int (* balance (/ (* 2 tax-free-percentage) 100))) 0))