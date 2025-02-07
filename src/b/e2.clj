;;; control flow: _if_ expression
;;
;; it follows this structure: (if condition form-1 form-2)
;; The first form is evaluated if condition is truthy (not nil or false)
;; The second form is evaluated if condition is falsy (nil or false)

(ns b.e2)

(defn -main [] 
    (println (if true "That's truthy" "That's falsey"))
    (println (if false "On falsey the if-expression returns nil!"))
)