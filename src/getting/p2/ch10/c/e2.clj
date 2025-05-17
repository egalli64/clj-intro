;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; reverse, composing sort and reverse

(def titles ["Jaws" "Emma" "2001" "Dracula"])
(type titles)
(def reversed-titles (reverse titles))
(type sorted-titles)
(println titles sorted-titles)

;; sort then reverse
(println (reverse (sort titles)))
