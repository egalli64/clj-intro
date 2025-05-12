;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; boolean functions: not and or

(not false)
(not true)

(and true true)
(and true true false)

(or false true false)
(or false false)

(def preferred-customer true)
(def express false)
(def oversized true)

(if (and (not preferred-customer) (or express oversized)) "no surcharge!" "surcharge :(")
