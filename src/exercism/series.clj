;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Series: https://exercism.org/tracks/clojure/exercises/series/
(ns exercism.series)

(defn slices "Returns all contiguous substrings of length n from the string s." [s n]
  (let [len (count s)]
    (cond (empty? s) (throw (IllegalArgumentException. "series cannot be empty"))
          (zero? n) (throw (IllegalArgumentException. "slice length cannot be zero"))
          (neg? n) (throw (IllegalArgumentException. "slice length cannot be negative"))
          (> n len) (throw (IllegalArgumentException. "slice length cannot be greater than series length"))
          :else (map #(subs s % (+ % n)) (range (- len (dec n)))))))
