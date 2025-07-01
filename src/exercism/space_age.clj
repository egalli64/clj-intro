;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Space Age: https://exercism.org/tracks/clojure/exercises/space-age/
(ns exercism.space-age)

(defn on-earth "Returns someone's age on Earth based on the given age in seconds"
  [seconds] (let [secs-year 31557600] (/ seconds secs-year)))

(defn on-mercury "Returns someone's age on Mercury based on the given age in seconds"
  [seconds] (let [earth-ratio 0.2408467] (/ (on-earth seconds) earth-ratio)))

(defn on-venus "Returns someone's age on Venus based on the given age in seconds"
  [seconds] (let [earth-ratio 0.61519726] (/ (on-earth seconds) earth-ratio)))

(defn on-mars "Returns someone's age on Mars based on the given age in seconds"
  [seconds] (let [earth-ratio 1.8808158] (/ (on-earth seconds) earth-ratio)))

(defn on-jupiter "Returns someone's age on Jupiter based on the given age in seconds"
  [seconds] (let [earth-ratio 11.862615] (/ (on-earth seconds) earth-ratio)))

(defn on-saturn "Returns someone's age on Saturn based on the given age in seconds"
  [seconds] (let [earth-ratio 29.447498] (/ (on-earth seconds) earth-ratio)))

(defn on-uranus "Returns someone's age on Uranus based on the given age in seconds"
  [seconds] (let [earth-ratio 84.016846] (/ (on-earth seconds) earth-ratio)))

(defn on-neptune "Returns someone's age on Neptune based on the given age in seconds"
  [seconds] (let [earth-ratio 164.79132] (/ (on-earth seconds) earth-ratio)))
