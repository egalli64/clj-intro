;;; For more info read Living Clojure by Carin Meier
;; exceptions: agent-error, restart-agent

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

(send absolem change-crash)
(println "After crashing the agent status is :failed ..." absolem)

;; can't send a change to a failed agent
(try (send absolem change) (catch RuntimeException e (println "RuntimeException caught:" (.getMessage e))))

;; check the agent errors
(agent-error absolem)

;; the agent should be restarted
(restart-agent absolem :caterpillar)
(println "After restart the agent status is :ready ..." absolem)

;; ... and then it can be used as usual
(dotimes [i 5]
  (send absolem change)
  (println (inc i) "- after send the value is" @absolem))
