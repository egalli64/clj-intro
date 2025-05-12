;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; map and keyword

;; usually keys in a map have keyword type
(def book {:title "Oliver Twist", :author "Dickens", :published 1838})
(println "The book map:" book)

;; get a value
(get book :published)
(book :published)
;; the keyword could be used as function to look in a map
(:published book)
