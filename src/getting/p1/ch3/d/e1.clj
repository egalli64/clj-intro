;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; keys: sequence of the map keys

;; a map
(def book {:title "Oliver Twist", :author "Dickens", :published 1838})
(println "The book map:" book)

;; notice that the order is preserved
(println "The book keys: " (keys book))
