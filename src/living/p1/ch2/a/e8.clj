;;; For more info read Living Clojure by Carin Meier
;; Flow control: cond :else - like an if - else if - ... chain

;; a function that generates a value in [1 .. 6]
(defn dice-value [] (inc (rand-int 6)))

;; cond
(println
 "Throw a dice ..."
 ;; x is bound to a random value in [1..6]
 (let [x (dice-value)]
   ;; check the following conditions, the first truthy one is picked up
   (cond
     (= x 6) "You have been lucky!"
     (= x 5) "Good enough"
     ;; no condition? nil is returned!
     )))

;; cond :else
(println
 "Throw a dice ..."
 ;; x is bound to a random value in [1..6]
 (let [x (dice-value)]
   ;; check the following conditions, the first truthy one is picked up
   (cond
     (= x 6) "You have been lucky!"
     (= x 5) "Good enough"
     (< x 3) "Lousy result :("
     ;; since 1.9 the :else keyword is the preferred way to manage the "else" branch 
     :else "Meh"
     ;; actually, anything truthy will do - pre 1.9, true was commonly used
     ;; true "Meh")
     )))
