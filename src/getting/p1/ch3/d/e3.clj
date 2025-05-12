;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; sorted-map: keys are in their natural order

;; a sorted map
(def book (sorted-map :title "Oliver Twist", :author "Dickens", :published 1838))
(println "The book (sorted) map:" book)

(println "The book keys: " (keys book))
(println "The book keys: " (vals book))
