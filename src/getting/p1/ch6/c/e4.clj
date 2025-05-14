;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; complement

;; a book
(def dracula {:title "Dracula", :author "Stoker", :price 1.99, :genre :horror})

;; a predicate
(defn historical? [book] (= (:genre book) :historical))
(historical? dracula)

;; negate a predicate (by hand)
(defn not-historical? [book] (not (historical? book)))
(not-historical? dracula)

;; more readable by complement
(def not-historical? (complement historical?))
(not-historical? dracula)
