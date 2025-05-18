;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; take as lazy function

;; mapping each positive integer in the sequence of even numbers
(def evens (map #(* 2 %) (iterate inc 1)))

;; the first twenty even integers
(take 20 evens)
