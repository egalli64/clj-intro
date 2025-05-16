;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; var

;; a bind creates a var (symbol + value)
(def author "Austen")

(def a_var #'author)
(println "A var has a symbol:" (.-sym a_var))
(println "A var has a value:" (.get a_var))
