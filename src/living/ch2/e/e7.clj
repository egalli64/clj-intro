;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Data transformation: flatten

(def animals [:mouse [:lory [:duck :penguin]] :shark])

(println "The original seq:" animals)
(println "The flatten seq:" (flatten animals))
