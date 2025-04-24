;;; For more info read Living Clojure by Carin Meier
;; dosync and alter

;; defining two refs
(def height (ref 3))
(def counter (ref 10))
(println "height and counter:" @height @counter)

(defn heigh-inc "if counter is positive increase height" []
  (when (pos? @counter)
    (alter counter dec)
    (alter height #(+ % 24))))

;; no alter outside a dosync block!
(print "Running an alter outside a dosync block leads to an IllegalStateException: ")
(try (heigh-inc) (catch IllegalStateException e (println (.getMessage e))))

;; alter in a dosync block
(dosync (heigh-inc))
(println "height and counter:" @height @counter)
