;;; For more info read Living Clojure by Carin Meier
;; agent, def and deref

;; defining an agent
(def absolem (agent :caterpillar))

;; an agent has a status and a val(ue)
(println "No direct access to agent value ..." absolem)

;; dereferencing an agent through the @ operator
(println "Deref an agent (by @ operator) ..." @absolem)

;; dereferencing an agent through the deref function
(println "Deref an agent (by deref function) ..." (deref absolem))
