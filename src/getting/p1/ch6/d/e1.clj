;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; literal function

;; a book
(def dracula {:title "Dracula", :author "Stoker", :price 1.99, :genre :horror})

;; an anonymous function expecting a single argument
(def horror? #(= (:genre %1) :horror))
(horror? dracula)

;; another anon function expecting a single argument
(def doubler #(* 2 %))
(doubler 21)

;; an anon function expecting three arguments
(def add-3-items #(+ %1 %2 %3))
(add-3-items 1 2 3)

;; another anon function expecting three arguments (the first two ignored)
(def negate_third #(- %3))
(negate_third 1 2 3)
