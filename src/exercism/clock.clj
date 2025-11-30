;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Clock: https://exercism.org/tracks/clojure/exercises/clock/
(ns exercism.clock)

(def DAY_MINUTES (* 24 60))

(defn clock->string [clock]
  (let [hours (int (/ clock 60)), minutes (mod clock 60)]
    (format "%02d:%02d" hours minutes)))

(defn clock [hours minutes]
  (mod (+ (* hours 60) minutes) DAY_MINUTES))

(defn add-time [clock time]
  (mod (+ clock time) DAY_MINUTES))
