;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; A few commonly used standard earmuffs

(def books ["Emma" "2001" "Jaws" "Oliver Twist"])
(println books)

;; change the print-length earmuff to 2
(set! *print-length* 2)
(println books)

;; set back the earmuff to its default value (nil)
(set! *print-length* nil)
(println books)

;; *1, *2, ... bound to the last (penultimate, ...) result from the REPL
(* 7 6)
(println *1)

;; *e bound to the last exception
(/ 1 0)
(println *e)
