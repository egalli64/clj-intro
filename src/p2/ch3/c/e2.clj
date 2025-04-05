;;; callables: function, macro, special form
;;
;; They are the three fundamental ways to control evaluation in Clojure
;; special forms and macro don't always evaluate all arguments and can't be passed to another expression
;; macros and functions can be user defined 

(ns p2.ch3.c.e2)

(defn -main []
    ;; special forms, compiler determined behavior
    (println "The if special form:" (if false 1 2))

    ;; macro, rearranged by the compiler, could be user generated
    (println "The or macro:" (or false 42))

    ;; function is the most common expression
    (println "The + function:" (+ 1 3))
)
