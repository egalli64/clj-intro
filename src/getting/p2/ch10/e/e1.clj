;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; map int to int

;; original seq
(def original-values [1, 21, 123])
;; doubling all the elements
(def doubled-values (map #(* 2 %) original-values))

(println original-values doubled-values)
