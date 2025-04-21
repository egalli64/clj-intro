;;; For more info read Living Clojure by Carin Meier
;; Laziness: range is a data structure behaving lazy
;; Deferred, on-demand evaluation

;; generate an infinite range starting from zero!
;; (println (range))

;; but it is not a concrete collection
(println (class (range)) (class (range 5)))

(println "a range in [0 .. 5):" (range 5))
(println "a range in [3 .. 8):" (range 3 8))
(println "a range in [5 .. 0) stepping by -1: " (range 5 0 -1))
