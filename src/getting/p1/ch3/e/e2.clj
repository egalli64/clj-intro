;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; search in a set: contains?, by key

(def authors #{"Dickens" "Austen" "King"})
(def genres #{:sci-fi :romance :mystery})

;; contains? checks for a _key_, in a set is what we expect
;; it returns true or false
(contains? authors "Austen")
(contains? genres "Austen")

;; using the set as a function
;; it returns the value associated to the key (in a set, the key itself) or nil
(authors "Austen")
(genres "Austen")

;; using a key as a function - returns the key or nil
(:sci-fi genres)
(:historical genres)
