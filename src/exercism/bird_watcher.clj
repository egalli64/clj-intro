;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Bird Watcher: https://exercism.org/tracks/clojure/exercises/bird-watcher/
;; Task 1: set the var last-week
;; Task 2: today -> the last value
;; Task 3: inc-bird -> increase the last value
;; Task 4: day-without-birds? -> is there a zero value?
;; Task 5: n-days-count -> sum of the first n items
;; Task 6: busy-days -> count 5+ items
;; Task 7: odd-week? -> matches [1 0 1 0 1 0 1]?

(ns exercism.bird-watcher)

(def last-week [0 2 5 3 7 8 4])

(some zero? last-week)

(defn today [birds] (peek birds))

(defn inc-bird [birds] (assoc birds (dec (count birds)) (inc (peek birds))))

(defn day-without-birds? [birds] (boolean (some zero? birds)))

(defn n-days-count [birds n] (apply + (take n birds)))

(defn busy-days [birds] (count (filter #(>= % 5) birds)))

(defn odd-week? [birds] (= birds [1 0 1 0 1 0 1]))
