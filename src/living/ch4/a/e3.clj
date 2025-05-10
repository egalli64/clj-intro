;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Java interop: the doto macro

;; chaining calls gets unreadable fast
(def sb (.append (.append (StringBuilder. "Who ") "are ") "you?"))
(println (.toString sb))

;; chaining with the doto macro
(def sb (doto (StringBuilder. "Who ") (.append "are ") (.append "you?")))
(println (.toString sb))
