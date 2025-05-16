;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; require: load a namespace not already in the current Clojure environment

;; define the vars in the user namespace
(def literature ["Emma" "Oliver Twist" "Possession"])
(def horror ["It" "Carry" "Possession"])

;; to use the diff function, we have to tell Clojure where to find it (in the clojure.data namespace)
;; the quote is to say that clojure.data is a symbol, do not evaluate it as an expression
(require 'clojure.data)
;; now we can call diff, using its qualified name
(clojure.data/diff literature horror)
