;;; For more info read Living Clojure by Carin Meier
;; boolean, nil, class, true?, false?, nil? not

(println "The type of an object (by class):" (class true))
(println "Check if true is true (by true?):" (true? true))
(println "Check if false is true (by true?):" (true? false))

(println "Check if true is false (by false?):" (false? true))
(println "Check if false is false (by false?):" (false? false))

(println "What is nil (by class)?" (class nil))
(println "Check if nil is nil (by nil?):" (nil? nil))
(println "Check if nil is true (by true?):" (true? nil))
(println "Check if nil is false (by false?):" (false? nil))

(println "not true is ..." (not true))        ; false
(println "not false is ..." (not false))      ; true
(println "not nil is ..." (not nil))          ; true!
(println "not whatever else is ..." (not 0))  ; false!
