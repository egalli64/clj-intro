;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; get value associated to a key

;; a map
(def book {"title" "Oliver Twist", "author" "Dickens", "published" 1838})
(println "The book map:" book)

;; get a value by the get function
(get book "published")
;; same, using the actual map as a function
(book "published")

;; missing key gives nil as associated value
(book "missing")
