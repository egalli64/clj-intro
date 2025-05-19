;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; set! *print-length*

(def numbers (iterate inc 1))

;; printing _all_ numbers won't be a good idea
;; (println numbers)

;; *print-length* is our friend
(set! *print-length* 10)

;; only *print-length* items are printed
(println numbers)
