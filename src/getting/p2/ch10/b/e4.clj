;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; cons

;; construct a new seq prepending the passing element to it (nil is the empty seq)
(cons "The name of the rose" nil)

;; notice that cons returns a seq
(def book {:title "Emma", :author "Austen", :published 1815})
(cons [:pages 213] book)
