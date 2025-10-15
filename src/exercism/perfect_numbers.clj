;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Perfect Numbers: https://exercism.org/tracks/clojure/exercises/perfect-numbers/

(ns exercism.perfect-numbers)

(defn- aliquot-sum [n]
  (cond
    (<= n 1) 0
    :else
    (let [limit (Math/floor (Math/sqrt n))]
      (loop [i 2, result 1]
        (if (> i limit)
          result
          (if (zero? (rem n i))                             ; i is an n divisor
            (if (= n (* i i))
              (recur (inc i) (+ result i))                  ; perfect square
              (recur (inc i) (+ result i (quot n i))))      ; "normal" case, add both values
            (recur (inc i) result)))))))                    ; not a divisor

(defn classify [num]
  (let [x (aliquot-sum num)]
    (cond (= x num) :perfect (< x num) :deficient :else :abundant)))
