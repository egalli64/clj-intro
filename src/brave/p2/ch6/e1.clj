;;; current namespace
;; By default, clj -M -m xyz runs -main in user namespace
;; To check the current namespace name: ns-name *ns* 
;; To change the current namespace: in-ns <namespace literal symbol>

(ns brave.p2.ch6.e1)

(defn -main []
    (println "The current namespace:" (ns-name *ns*))

    ;; change the current namespace, notice the quote before the namespace name
    (in-ns 'p2.ch6.e1)
    (println "The current namespace:" (ns-name *ns*))

    ;; create a new namespace, then make it the current one
    (in-ns 'xyz)
    (println "The current namespace:" (ns-name *ns*))
)
