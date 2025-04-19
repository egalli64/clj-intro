;;; For more info read Living Clojure by Carin Meier
;; class, boolean, nil, true?, false?, nil?

;; class
(println "What is true?" (class true))    ; boolean
(println "What is false?:" (class true))  ; boolean
(println "What is nil?" (class nil))      ; nil
(println "What is 42?" (class 42))        ; long

;; true?
(println "true is true?" (true? true))
(println "false is true?" (true? false))
(println "nil is true?" (true? nil))        ; false

;; false?
(println "true is false?" (false? true))
(println "false is false?" (false? false))
(println "nil is false?" (false? nil))      ; false

;; nil?
(println "nil is nil?" (nil? nil))
(println "whatever else is nil?" (nil? 0))
