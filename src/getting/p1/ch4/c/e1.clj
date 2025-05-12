;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; truthy, falsy

;; any integer, any string, any collection is considered true!
(if (and 1 "hello" [1 2 3])
  "I like science fiction!" "I like mysteries!")

;; actually, only false and nil are not true in boolean context
(if (or false nil)
  "I like science fiction!" "I like mysteries!")

;; they are all truthy
(if 0 "yes" "no")
(if 1 "yes" "no")
(if 1.0 "yes" "no")
(if :russ "yes" "no")
(if "Russ" "yes" "no")
(if "true" "yes" "no")
(if "false" "yes" "no")
(if "nil" "yes" "no")
(if [] (println "An empty vector is true!"))
(if [1 2 3] (println "So is a populated vector!"))
(if {} (println "An empty map is true!"))
(if {:title "Make Room! Make Room!"} (println "So is a full map!"))
(if () (println "An empty list is true!"))
(if '(:full :list) (println "So is a full list!"))
