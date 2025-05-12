;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; set data structure

;; literal syntax
(def authors #{"Dickens" "Austen" "King"})
(println "A set:", authors)

;; build by function
(def genres (hash-set :sci-fi :romance :mystery))
(println "Another set:", genres)

;; this would cause a syntax error: duplicated key
;; #{"Dickens" "Austen" "Dickens"}

;; this works fine, duplicated items are discarded
(hash-set "Dickens" "Austen" "Dickens")
