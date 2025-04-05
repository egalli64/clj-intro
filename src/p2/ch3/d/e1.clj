;;; _let_ - binding a value to a symbol in the local scope
;;
;; a symbol/value defined in a let expression is only visible in that let expression
;; to stress this fact is also called _local binding_
;;
;; _def_ defines a binding at global (namespace bound) scope

(ns p2.ch3.d.e1)

;; def is for global bindings
(def x 0)
(def names ["Bob" "Tim" "Jim"])

(defn -main []
    ;; local binding the name x to the value 42
    (let [x 42]
        ;; x refers to the local binding
        (println "x is" x) ; 42
    )

    ;; x refers to the global binding
    (println "x is" x) ; 0

    ;; using destructuring in let
    (let [[first & more] names] 
        (println first "and" more)
    )
)
