;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; first

(def titles ["Emma" "Oliver Twist" "Robinson Crusoe"])
(first titles)

(def book {:title "Emma", :author "Austen", :published 1815})
(first book)

;; first on an empty collection, or even on nil, leads to nil
(first [])
(first nil)
