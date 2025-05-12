;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; assoc: add entries or modify and existing ones

;; a map
(def book {:title "Oliver Twist", :author "Dickens", :published 1838})
(println "The book map:" book)

;; add an entry to a map
(def book-2 (assoc book :pages 362))
(println "The improved book:" book-2)

;; edit a map, adding an entry and changing a key/value relation
(def book-3 (assoc book :pages 362 :title "War & Peace"))
(println "A modified book:" book-3)
