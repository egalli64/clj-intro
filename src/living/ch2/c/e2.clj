;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; _take_ on a sequence
;; generate a new lazy sequence containg ()at most) the first n elements of the original one
;; _count_ the elements in a sequence
;; _repeat_ an element to generate a sequence

;; generate an infinite range starting from zero!
;; (println (range))

;; take
(println "Take the first 5 items from the infinite range:" (take 5 (range)))
(println "Take generates a lazy sequence:" (class (take 5 (range))))
(println "Take at most the first 5 items from a range:" (take 5 (range 3)))

;; count take
(println "How many elements in a sequence?" (count (take 100000 (range))))

;; repeat
;; generate an infinite repetition of 42!
;; (println (repeat 42))
(println "Repeat generates a Repeat object:" (class (repeat 42)))

;; generate a repetition
(println "Ten times fortytwo:" (repeat 10 42))
(println "Counting elements in a repetition:" (count (repeat 100000 42)))
