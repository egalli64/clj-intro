;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Largest Series Product: https://exercism.org/tracks/clojure/exercises/largest-series-product/
(ns exercism.largest-series-product)

(defn char->digit [^Character c]
  (if (Character/isDigit c)
    (Character/digit c 10)
    (throw (IllegalArgumentException. "digits input must only contain digits"))))

(defn largest-product "Returns the largest product of any consecutive digits of length span in the string s."
  [^long span ^String s]
  (when (neg? span) (throw (IllegalArgumentException. "span must not be negative")))
  (when (> span (count s)) (throw (IllegalArgumentException. "span must not exceed string length")))

  (->> s
       (map char->digit)
       (partition span 1)
       (map #(apply * %))
       (apply max)))
