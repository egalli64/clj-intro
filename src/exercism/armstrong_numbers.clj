;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Armstrong Numbers: https://exercism.org/tracks/clojure/exercises/armstrong-numbers/
(ns exercism.armstrong-numbers)

(defn armstrong? "Returns true if the given number is an Armstrong number; otherwise, returns false"
  [num]
  (let [s (str num), exp (count s)]
    (->> s
         (map #(^[char] Character/getNumericValue %))
         (map #(.pow (BigInteger/valueOf %) exp))
         (reduce +)
         (= num))))
