;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; be careful about rebinding objects/functions

;; bind a symbol (author) to a value (the string "Dickens")
(def author "Dickens")
(println "Author is" author)

;; redefining a var (new value bound to a symbol already used) - considered BAD style
(def author "Jerome")
(println "Author is" author)

;; redefining a var to make it a function! - considered VERY BAD style
(defn author [name]
  (println "Hey," name "is writing a book!"))
(author "Stevenson")
