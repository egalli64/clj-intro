;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; iterate

;; here iterate create a seq increasing the values, starting from 1
(def numbers (iterate inc 1))

;; just the first item
(first numbers)

;; same, the item with "index" 0
(nth numbers 0)

;; whichever item I want, the iteration provides it
(nth numbers 10943)

;; the first 10 items
(take 10 numbers)
