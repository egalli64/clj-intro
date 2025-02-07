;;; _def_ to bind a name to a value

(ns b.e7)

;; define _globally_! the name 'user' and bind it to the string 'Bob'
;; it is possible to rebound a name to another value, but don't do that (if you can avoid to do it)
(def user "Bob")

(defn -main []
    ;; user is globally accessible in all the namespace
    (if (= user "Bob")
        (println "Welcome back," user)
        ;; it is possible to rebound a name, but it is not considered a good practice
        (def user "Unknown")
    )

    (println "Now user is Bob or Unknown:" user)
)
