;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; dissoc: remove entries

;; a map
(def book {:title "Oliver Twist", :author "Dickens", :published 1838})
(println "The book map:" book)

;; remove an entry to a map
(def book-2 (dissoc book :published))
(println "The reduced book:" book-2)

;; all the key could be removed
(def book-2 (dissoc book :title :author :published))
(println "An empty book:" book-2)

;; dissoc on non-existing key is ignored
(def book-4 (dissoc book :pages))
(println "A non-modified book:" book-3)
