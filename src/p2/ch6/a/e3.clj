;;; create-ns, ns-name, in-ns

(ns p2.ch6.a.e3)

(defn -main []
    (println "The current namespace:" (ns-name *ns*))

    ;; create a namespace (if it doesn't exist)
    (println "Create a namespace:" (create-ns 'another))
    ;; get the name of the passed namespace
    (println "Name of namespace:" (ns-name (create-ns 'another)))

    ;; the current namespace has not changed
    (println "The current namespace has not changed:" (ns-name *ns*))

    ;; create a namespace (if it doesn't exist) and switch to it
    (in-ns 'another)
    (println "After in-ns:" (ns-name *ns*))
)
