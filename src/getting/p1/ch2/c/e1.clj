;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; vector: conj, cons

;; a vector
(def novels ["Emma" "Coma" "War and Peace"])

;; add an item to the collection in the most "natural" place (at the end, for a vector)
(conj novels "Carrie")

;; add an item to the collection in the first position - and return a new sequence
(cons "Carrie" novels)

(println "The original vector has not changed:" novels)
