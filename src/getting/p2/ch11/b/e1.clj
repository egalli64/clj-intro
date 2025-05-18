;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; cycle

;; base of the cycle
(def base [1 2 3])

;; here repeat generate an infinite seq of base!
(def items (cycle base))

;; just the first item
(first items)

;; just the tenth item
(nth items 10)

;; whichever item I want, the cycle provides it
(nth items 10943)

;; now I want 20 items
(take 10 items)
