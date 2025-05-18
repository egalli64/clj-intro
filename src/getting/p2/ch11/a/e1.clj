;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; repeat

;; a string that we want to repeat an unknown number of times
(def jack "All work and no play makes Jack a dull boy.")

;; when specifying the count, repeat generates a seq of the given size
(println (repeat 3 jack))

;; here repeat generate an infinite seq of jacks!
(def many-jacks (repeat jack))

;; just the first jack
(first many-jacks)

;; just the tenth jack (actually, are the jacks are equal)
(nth many-jacks 10)

;; whichever jack I want, many-jacks provides it
(nth many-jacks 10942)

;; now I want 20 jacks
(take 20 many-jacks)
