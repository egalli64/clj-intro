;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; interleave as lazy function

(def positive-integers (iterate inc 1))
(def positive-evens (map #(* 2 %) positive-integers))
(def interleaved (interleave positive-integers positive-evens))

(take 10 interleaved)
