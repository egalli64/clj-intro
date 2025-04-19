;;; For more info read Living Clojure by Carin Meier
;; Logic tests on collections: every?
;; check each element in a collection

(println "is every one odd?" (every? odd? [1 3 5]))
(println "is every one even?" (every? even? [0 2 5]))

;; predicate functions usually have a name ending by question mark
(defn good? [x] (zero? (mod x 7)))
(println "is every one good?" (every? good? [7 42 14]))
(println "is every one good?" (every? good? [7 42 11]))

;; by anonymous functions
(println "is every one good?" (every? (fn [x] (zero? (mod x 7))) [7 42 14]))
(println "is every one good?" (every? #(zero? (mod % 7)) [7 42 1]))
