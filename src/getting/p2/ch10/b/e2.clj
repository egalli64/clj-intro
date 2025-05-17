;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; rest

(def titles ["Emma" "Oliver Twist" "Robinson Crusoe"])
(rest titles)

(def book {:title "Emma", :author "Austen", :published 1815})
(rest book)

;; first on an empty collection, or even on nil, leads to an empty seq
(rest [])
(rest nil)
