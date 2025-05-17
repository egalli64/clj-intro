;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; sort: works on any seqable, returns a seq

(def titles ["Jaws" "Emma" "2001" "Dracula"])
(type titles)
(def sorted-titles (sort titles))
(type sorted-titles)
(println titles sorted-titles)
