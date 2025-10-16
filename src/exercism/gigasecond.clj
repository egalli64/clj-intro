;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Gigasecond: https://exercism.org/tracks/clojure/exercises/gigasecond/

(ns exercism.gigasecond
  (:require [clojure.string :as str])
  (:import (java.time LocalDate)))

;; it takes 11574 day for a gigasecond
(def GIGA2DAYS (long (/ 1000000000 (* 60 60 24))))

(defn from "Determines the date one gigasecond after the given date." [^long year ^long month ^long day]
  (let [date (LocalDate/of year month day) result (.plusDays date GIGA2DAYS)]
    (map parse-long (str/split (str result) #"-"))))
