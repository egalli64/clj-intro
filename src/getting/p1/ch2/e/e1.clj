;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; list: conj, cons

;; a list
(def novels '("Emma" "Coma" "War and Peace"))

;; add an item to the collection in the most "natural" place (at the beginning, for a list)
(conj novels "Carrie")

;; add an item to the collection in the first position - and return a new sequence
(cons "Carrie" novels)

(println "The original vector has not changed:" novels)
