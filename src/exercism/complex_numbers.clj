;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Complex Numbers: https://exercism.org/tracks/clojure/exercises/complex-numbers/
(ns exercism.complex-numbers)

(defn real [[a _]] a)

(defn imaginary [[_ b]] b)

(defn abs [[a b]] (Math/sqrt (+ (* a a) (* b b))))

(defn conjugate [[a b]] [a (- b)])

(defn add [[a b] [c d]] [(+ a c) (+ b d)])

(defn sub [[a b] [c d]] [(- a c) (- b d)])

(defn mul [[a b] [c d]] (let [real (- (* a c) (* b d)) img (+ (* b c) (* a d))] [real, img]))

(defn div [[a b] [c d]]
  (let [quot (+ (* c c) (* d d)), real (/ (+ (* a c) (* b d)) quot), img (/ (- (* b c) (* a d)) quot)] [real, img]))