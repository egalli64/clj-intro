;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Square Root: https://exercism.org/tracks/clojure/exercises/square-root/
(ns exercism.square-root)

;; we are interested only in positive integer (> 0) in, giving whole integer out
;; lazy solution: (int (Math/sqrt n))
(defn square-root "Calculates a number's square root" [n]
  (loop [left 1, right (inc (quot n 2))]
    (let [x (quot (+ left right) 2), square (* x x)]
      (cond (< square n) (recur (inc x) right)
            (> square n) (recur left (dec x))
            :else x))))
