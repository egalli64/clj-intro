;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; symbol

(println "A symbol:" 'author)
;; uncomment next line to get a syntax error, unable to resolve symbol
;; (println "Unbound symbol:" author)

;; the string Austen is bound to the symbol author
(def author "Austen")
(println "The value bound to the symbol:" author)

;; convert a symbol to a string
(println "A symbol turned into a string:" (str 'author))

(when (= 'author 'author) (println "A symbol is equal to itself"))
