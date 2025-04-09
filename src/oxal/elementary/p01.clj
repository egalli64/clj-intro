;; Problem 1, Nothing but the Truth
;; https://4clojure.oxal.org/#/problem/1
;; (= __ true): true

;; elaborating on the theme
(println "true is true?" (= true true))
(println "Is there anything else than the boolean true that is true?" (= 1 true))
(println (when true "true is truthy"))
(println (if nil "Unexpected" "nil is falsey"))
(println (if false "Unexpected" "false is falsey"))
(println (when (and 0 "" {}) "Anything else is truthy"))
"I mean, anything else is truthy"

(print "Is the actual problem solved? ")
(= true true)
