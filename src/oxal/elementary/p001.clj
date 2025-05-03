;; Problem 1, Nothing but the Truth
;; Fill the __ with a valid element so that expression is true
;; https://4clojure.oxal.org/#/problem/1
;; (= __ true)

;; thinking ...
(println "true is true?" (= true true))
(println "Is there anything else than the boolean true that is true?" (= 1 true))
(println (when true "true is truthy"))
(println (if nil "Unexpected" "nil is falsey"))
(println (if false "Unexpected" "false is falsey"))
(println (when (and 0 "" {}) "Anything else is truthy"))

;; my solution
(def solution true)

;; verify it
(print "Is the problem solved? ")
(= solution true)
