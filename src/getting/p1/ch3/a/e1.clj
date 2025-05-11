;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; map data structure

;; literal syntax to define a map
(def book {"title" "Oliver Twist", "author" "Dickens", "published" 1838})
(println "The book map:" book)

;; using the hash-map function
(def book (hash-map "title" "Oliver Twist", "author" "Dickens", "published" 1838))
(println "The book map:" book)

;; get a value by the get function
(get book "published")
;; same, using the actual map as a function
(book "published")
