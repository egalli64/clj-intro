;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Laziness: range is a data structure behaving lazy
;; Deferred, on-demand evaluation

;; generate an infinite range starting from zero!
;; (println (range))

;; it is not a concrete collection
(println "Two types of ranges:" (class (range)) (class (range 5)))
;; a seqable is an object that could be converted to a sequence
(println "A range is a seqable?" (not (nil? (seq (range)))))

(println "a range in [0 .. 5):" (range 5))
(println "a range in [3 .. 8):" (range 3 8))
(println "a range in [5 .. 0) stepping by -1: " (range 5 0 -1))
