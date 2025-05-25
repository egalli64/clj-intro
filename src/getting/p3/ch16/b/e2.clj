;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; java.awt.Rectangle

;; create a new object: class.
(def rect (java.awt.Rectangle. 0 0 10 20))

;; access fields
(println "Width:" (.-width rect))
(println "Height:" (.-height rect))
