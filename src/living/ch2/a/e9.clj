;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Flow control: case

;; a function that generates a value in [1 .. 6]
(defn dice-value [] (inc (rand-int 6)))

;; case
(println
 "Throw a dice ..."
 ;; x is bound to a random value in [1..6]
 (let [x (dice-value)]
   ;; check the following conditions, the first truthy one is picked up
   (case x
     6 "You have been lucky!"
     5 "Good enough"
     4 "You barely made it"
     ;; no match, IllegalArgumentException!
     )))

;; case default
(println
 "Throw a dice ..."
 ;; x is bound to a random value in [1..6]
 (let [x (dice-value)]
   ;; check the following conditions, the first truthy one is picked up
   (case x
     6 "You have been lucky!"
     5 "Good enough"
     4 "You barely made it"
     "Lousy result :(")))
