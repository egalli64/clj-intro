;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Data transformation: filter and remove - complement

;; a seq
(def values [1 2 3 4 5])
(println "Original values:" values)

(println "Filter the odd values" (filter odd? values))
(println "Remove the odd values" (remove odd? values))

(println "Filter the complement odd (even) values" (filter (complement odd?) values))
(println "Filter the even values" (filter even? values))
