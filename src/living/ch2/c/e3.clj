;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; _repeatedly_ call a function to generate a sequence
;; _cycle_ generates a sequence of elements cycling on a sequence
;; _rest_ on cycle

;; _repeat_ works on a value
(println "Repeat five times a random value in [0..9]:" (repeat 5 (rand-int 10)))

;; _repeatedly_ works on a function
(println "Repeatedly generate a random value in [0..9]:" (repeatedly 5 #(rand-int 10)))

;; generate an infinite cycle on the passed sequence!
;; (println (cycle [:a :b]))

(println "A Cycle object:" (class (cycle [:a :b])))
(println "Take five elements on a cycle:" (take 5 (cycle [:a :b])))
(println "Take the 'last' five elements on a cycle:" (take 5 (rest (cycle [:a :b]))))
