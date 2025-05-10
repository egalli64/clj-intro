;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; exceptions: set-error-handler!

;; defining an agent
(def absolem (agent :caterpillar))
(println "Initial agent value is" @absolem)

;; a function meant to be used by send - but always failing
(defn change-crash [_] (println "Throwing an exception") (throw (IllegalStateException. "Boom!")))

;; what to do when an exception occurs on an agent
(set-error-handler! absolem #(println "Error on agent:" %1 " with message:" (.getMessage %2)))

;; the exception now triggers the function set above
(send absolem change-crash)

;; give time to async jobs to complete
(Thread/sleep 100)

(println "Agent now is" absolem)
