;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Rotational Cipher: https://exercism.org/tracks/clojure/exercises/rotational-cipher/
(ns exercism.rotational-cipher)

(defn- rot [c i]
  (cond
    (Character/isLowerCase ^char c) (char (+ (int \a) (mod (+ (- (int c) (int \a)) i) 26)))
    (Character/isUpperCase ^char c) (char (+ (int \A) (mod (+ (- (int c) (int \A)) i) 26)))
    :else c))

(defn rotate [s i]
  (apply str (map #(rot % i) s)))
