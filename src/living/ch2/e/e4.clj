;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Data transformation: reduce

;; a seq
(def values [1 2 3 4 5])
(println "Original values:" values)

(println "Reduce by adding:" (reduce + values))

;; the reducing function should accept two args, its result is accumulated and then returned
(println "Reduce by adding the squared values:" (reduce #(+ %1 (* %2 %2)) values))

;; having a starting value, the reduced seq could be empty
(println "Reduce with a starting value:" (reduce + 1000 values))
(println "Reduce an empty seq:" (reduce + 1000 []))

;; reduce could also filter (not considered a healty approach - see filter function)
(println "Add only the odd values:" (reduce (fn [acc x] (if (even? x) acc (+ acc x))) values))
