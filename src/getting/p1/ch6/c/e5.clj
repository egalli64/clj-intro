;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; every-pred

;; a book
(def dracula {:title "Dracula", :author "Stoker", :price 1.99, :genre :horror})

;; some predicates
(defn cheap? [book] (< (:price book) 5))
(cheap? dracula)

(defn horror? [book] (= (:genre book) :horror))
(horror? dracula)

;; combine predicates by "and"
(def cheap-horror? (every-pred cheap? horror?))
(cheap-horror? dracula)

;; a more complex combination
(def cheap-horror-dracula? (every-pred cheap? horror? (fn [book] (= (:title book) "Dracula"))))
(cheap-horror-dracula? dracula)
