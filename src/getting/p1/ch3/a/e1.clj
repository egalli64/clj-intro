;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; map data structure

;; literal syntax to define a map
(def book {"title" "Oliver Twist", "author" "Dickens", "published" 1838})
;; notice that the entry insertion order is preserved
(println "The book map:" book)

;; using the hash-map function
(def book (hash-map "title" "Oliver Twist", "author" "Dickens", "published" 1838))
(println "The book map:" book)
