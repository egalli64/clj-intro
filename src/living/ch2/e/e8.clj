;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Data transformation: into

(def animals '(:mouse :lory :duck :penguin :shark))

(println "The original seq:" animals)
(println "Converted to vector (by vec):" (vec animals))
;; _into_ is more flexible (and verbose)
(println "Converted to vector (by into):" (into [] animals))

;; _into_ for merging into an existing seq
(println "Poured into a vector (by into):" (into [:whale] animals))

;; _into_ for converting collection type
(def zoo {:mouse 3, :lory 5, :duck 42, :penguin 98, :shark 4})
(println "The original map:" zoo)
(println "Sorted:" (into (sorted-map) zoo))
