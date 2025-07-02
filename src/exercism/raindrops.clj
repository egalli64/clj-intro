;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Raindrops: https://exercism.org/tracks/clojure/exercises/raindrops/
(ns exercism.raindrops)

(defn convert [num]
  (let [sound (->> [[3 "Pling"] [5 "Plang"] [7 "Plong"]]
                   (filter #(zero? (mod num (first %))))
                   (map second)
                   (apply str))]
    (if (empty? sound) (str num) sound)))
