;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; def, defn

;; bind the symbol title to the value "Emma"
(def title "Dracula")
(println title)

;; a constant (by naming convention)
(def PI 3.14)
(println PI)

;; a book, a def referring to a previous def (title)
(def dracula {:title title, :author "Stoker", :price 1.99, :genre :horror})

;; defn is a macro for def a fn
(defn book-description [book] (str (:title book) ", written by " (:author book)))
(println (book-description dracula))

;; same as the defn above
(def book-description (fn [book] (str (:title book) ", written by " (:author book))))
(println (book-description dracula))

;; a defn using a previous def in its body
(defn circle-area [radius] (* PI (* radius radius)))
(println (circle-area 3.6573))
