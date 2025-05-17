;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; next

(def titles ["Emma" "Oliver Twist" "Robinson Crusoe"])
(next titles)

(def book {:title "Emma", :author "Austen", :published 1815})
(next book)

;; next on an empty collection, or even on nil, leads to nil (see rest)
(next [])
(next nil)
