;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; atom, def and deref

;; defining an atom
(def absolem (atom :caterpillar))

;; an atom has a status and a val(ue)
(println "No direct access to atom value ..." absolem)

;; dereferencing an atom through the @ operator
(println "Deref an atom (by @ operator) ..." @absolem)

;; dereferencing an atom through the deref function
(println "Deref an atom (by deref function) ..." (deref absolem))
