;;; For more info read Living Clojure by Carin Meier
;; commute, reduce the number of retries
;; but the function should be commutative (like adding)

 (def counter (ref 0))
(println "Counter:" @counter)

(print "Running a commute outside a dosync block leads to an IllegalStateException: ")
(try (commute counter inc) (catch IllegalStateException e (println (.getMessage e))))

(dosync (commute counter inc))
(println "Counter:" @counter)
