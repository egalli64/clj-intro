;;; _def_ to bind a value to a symbol in the global scope

(ns brave.p2.ch3.a.e7)

;; define _globally_! the symbol 'user' and bind it to the string 'Bob'
;; it is possible to rebound a symbol to another value, but don't do that (if you can avoid it)
(def user "Bob")

;; Using this def the if check would fail
;; (def user "Val")

(defn -main []
    ;; user is globally accessible in all the namespace
    (if (= user "Bob")
        (println "Welcome back," user)
        ;; it is possible to rebound a symbol, but it is not considered a good practice
        (def user "Unknown")
    )

    (println "Now user is Bob or Unknown:" user)
)
