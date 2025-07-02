;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Triangle: https://exercism.org/tracks/clojure/exercises/triangle/
(ns exercism.triangle)

(defn- degenerate? [a b c]
  (or (some zero? [a b c]) (< (+ a b) c) (< (+ a c) b) (< (+ b c) a)))

(defn equilateral? "Returns true if the triangle with sides a, b, and c is equilateral; otherwise, returns false"
  [a b c] (if (degenerate? a b c) false (= a b c)))

(defn isosceles?
  "Returns true if the triangle with sides a, b, and c is isosceles; otherwise, returns false"
  [a b c]
  (if (degenerate? a b c) false (or (= a b) (= a c) (= b c))))

(defn scalene?
  "Returns true if the triangle with sides a, b, and c is scalene; otherwise, returns false"
  [a b c]
  (if (degenerate? a b c) false (and (not= a b) (not= a c) (not= c b))))