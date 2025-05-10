;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; ref: def and deref

;; defining two refs
(def height (ref 3))
(def counter (ref 10))

;; a ref has a status and a val(ue)
(println "No direct access to ref values ..." height counter)

;; dereference a ref through the @ operator
(println "Deref refs (by @ operator) ..." @height @counter)

;; dereference a ref through the deref function
(println "Deref refs (by deref function) ..." (deref height) (deref counter))
