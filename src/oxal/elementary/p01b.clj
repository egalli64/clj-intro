;;;
;; Only false and nil are falsey

(println (if nil "Unexpected" "nil is falsey"))
(println (if false "Unexpected" "false is falsey"))
(println (when (and 0 "" {}) "Anything else is truthy"))
"I mean, anything else is truthy"
