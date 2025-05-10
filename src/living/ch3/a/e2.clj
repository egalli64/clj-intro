;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; reset!
;; the ! signals that the function changes state

;; defining an atom
(def absolem (atom :caterpillar))
(println "Initial atom value is" @absolem)

;; use reset! just to atomically assign a new value to the atom
;; it is a synchronous, blocking, operation
(reset! absolem :chrysalis)
(println "After reset! its value is" @absolem)

(reset! absolem :caterpillar)
(println "Back to the original value ..." @absolem)
