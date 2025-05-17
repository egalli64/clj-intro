;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; map to seq - the base item is a key/value pair, rendered with a vector
(def book {:title "Emma", :author "Austen", :published 1815})
(type book)
(def my-seq (seq book))
(type my-seq)
(println my-seq)
