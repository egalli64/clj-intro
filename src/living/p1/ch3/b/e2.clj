;;; For more info read Living Clojure by Carin Meier
;; dosync and ref-set

;; defining two refs
(def alpha (ref 1))
(def beta (ref 11))
(println "Initial ref value is" @alpha @beta)

;; can't ref-set outside a dosync block
(try (ref-set alpha 42) (catch IllegalStateException e (println (.getMessage e))))

;; the right way to do it: ref-set in a dosync block
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
