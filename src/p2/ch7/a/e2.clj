;;; eval
(ns p2.ch7.a.e2)

;; (defn -main []
;;     (eval (list 'def 'x 42)) 
;;     (println (eval (list 'def 'x 42)))
;;     (let [x (ns-resolve 'user 'x)]
;;         (when x (println "x =" @x)))
;; )

(defn -main []
    ;; define a list
    (let [xs '(+ 1 2)]
        ;; use the list as data
        (println "A list:" xs)
        ;; evaluate the list as code
        (println "Evaluate it:" (eval xs))

        ;; modify the list
        (println "Concat it:" (concat xs [10]))
        (println "Evaluate it:" (eval (concat xs [10])))

        ;; eval to def a var
        (println "Define x in user:" (eval (list 'def 'x (concat xs [10]))))
        ;; use the newly defined global variable
        (let [x (ns-resolve 'user 'x)]
            (when x (println "x value is" @x)))
    )
)
