;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; change a set: conj, disj

(def authors #{"Dickens" "Austen" "King"})

;; conj on a set
(def more-authors (conj authors "Clarke"))
(println "More authors:", more-authors)

;; more items, duplicated discarded
(conj more-authors "Clarke" "Ballard")

;; disj to remove an item
(disj more-authors "King")

;; more items, missing won't hurt
(disj more-authors "King" "Ballard")
