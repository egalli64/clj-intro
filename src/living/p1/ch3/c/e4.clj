;; For more info read Living Clojure by Carin Meier
;; exceptions: set-error-mode!

;; defining an agent
(def absolem (agent :caterpillar))
(println "Initial agent value is" @absolem)

;; a function meant to be used by send on an agent
(defn change [value]
  (case value
    :caterpillar :chrysalis
    :chrysalis :butterfly
    :butterfly))

;; a function meant to be used by send - but always failing
(defn change-crash [_] (throw (IllegalStateException. "Boom!")))

;; swallow exceptions
(set-error-mode! absolem :continue)

(send absolem change-crash)
(println "After crashing (:continue) the agent status is still :ready ..." absolem)

;; can't send a change to a failed agent
(try (send absolem change) (catch RuntimeException e (println "RuntimeException caught:" (.getMessage e))))
(dotimes [i 3]
  (send absolem change)
  (println (inc i) "- after send the value is" @absolem))
