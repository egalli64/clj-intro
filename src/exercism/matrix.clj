;;;; clj-intro - Introduction to Clojure
;;;; https://github.com/egalli64/clj-intro
;;;;
;;;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;;;
;;;; Matrix: https://exercism.org/tracks/clojure/exercises/matrix/
(ns exercism.matrix
  (:require [clojure.string :as str]))

(defn- string-to-matrix [s]
  (map #(map (fn [x] (Integer/parseInt x)) (str/split % #" ")) (str/split s #"\n")))

(defn get-row "Returns the i-th row of the matrix s" [s i]
  (nth (string-to-matrix s) (dec i)))

(defn get-column "Returns the i-th column of the matrix s" [s i]
  (nth (apply map list (string-to-matrix s)) (dec i)))
