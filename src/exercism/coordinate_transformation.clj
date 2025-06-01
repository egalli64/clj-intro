;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Coordinate Transformation: https://exercism.org/tracks/clojure/exercises/coordinate-transformation/
(ns exercism.coordinate-transformation)

(defn translate2d
  "Returns a function making use of a closure to perform a repeatable 2d translation of a coordinate pair."
  [dx dy] #(vector (+ %1 dx) (+ %2 dy)))

(defn scale2d
  "Returns a function making use of a closure to perform a repeatable 2d scale of a coordinate pair."
  [sx sy] #(vector (* %1 sx) (* %2 sy)))

(defn compose-transform
  "Create a composition function that returns a function that
  combines two functions to perform a repeatable transformation."
  [f g] #(apply g (f %1 %2)))

(defn memoize-transform
  "Returns a function that memoizes the last result.
   If the arguments are the same as the last call, the memoized result is returned."
  [f]
  (let [memo (atom {})]
    (fn [& args] (get @memo args (let [result (apply f args)] (reset! memo {(vec args) result}) result)))))
