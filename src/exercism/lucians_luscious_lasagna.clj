;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Lucian's Luscious Lasagna: https://exercism.org/tracks/clojure/exercises/lucians-luscious-lasagna/
;; Task 1: Define expected-time as 40
;; Task 2: Define the remaining-time function
;; Task 3: Define the prep-time function, knowing that each layer takes you 2 minutes
;; Task 4: Define the total-time function
(ns exercism.lucians-luscious-lasagna)

(def expected-time 40)
(def time-for-layer 2)

(defn remaining-time
  "Takes the actual time in minutes the lasagna has been in the oven,
   and returns how many minutes the lasagna still has to remain in the oven."
  [actual-time] (- expected-time actual-time))

(defn prep-time
  "Takes the number of layers added to the lasagna,
   and returns how many minutes you spent preparing the lasagna"
  [num-layers] (* num-layers time-for-layer))

(defn total-time
  "Takes the number of layers of lasagna and the actual time in minutes it has been in the oven.
   Returns how many minutes in total you've worked on cooking the lasagna"
  [num-layers actual-time] (+ actual-time (prep-time num-layers)))
