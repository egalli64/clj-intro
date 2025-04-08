;;;
;; Invoking Java methods

(println "Invoking a Java instance method:" (.length "Hello"))
(println "Instantiate a Java object (explicit new):" (new java.util.Date))
(println "Instantiate a Java object (implicit new):" (java.util.Date.))
(println "Invoking a Java static method:" (Math/pow 7 2))
