;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; partial

;; a book
(def dracula {:title "Dracula", :author "Stoker", :price 1.99, :genre :horror})

;; a function taking two arguments
(defn cheaper-than [price book] (< (:price book) price))

;; implementing predicates as partial
(def real-cheap? (partial cheaper-than 1.00))
(real-cheap? dracula)

(def kind-of-cheap? (partial cheaper-than 2.00))
(kind-of-cheap? dracula)

(def marginally-cheap? (partial cheaper-than 6.00))
(marginally-cheap? dracula)
