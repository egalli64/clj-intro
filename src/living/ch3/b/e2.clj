;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; dosync and ref-set

;; defining two refs
(def alpha (ref 1))
(def beta (ref 11))
(println "Initial ref value are" @alpha @beta)

;; no ref-set outside a dosync block!
(print "Running a ref-set outside a dosync block leads to an IllegalStateException: ")
(try (ref-set alpha 42) (catch IllegalStateException e (println (.getMessage e))))

;; ref-set in a dosync block
(dosync (ref-set alpha 42) (ref-set beta 24))
(println "Current ref values ..." @alpha @beta)

;; but beware of conflicts!
;; (dosync (ref-set alpha beta) (ref-set beta alpha))

;; swap ref values example
(dosync
 ;; read initial values into local bounds
 (let [alpha-tmp @alpha, beta-tmp @beta]
   ;; swap them
   (ref-set alpha beta-tmp)
   (ref-set beta alpha-tmp)))
(println "Current ref values ..." @alpha @beta)
