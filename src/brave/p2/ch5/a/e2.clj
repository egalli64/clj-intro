;;; side effects - modify the external state (mutation, I/O, global variables ...)
;;
;; a pure function has no side effect

(ns brave.p2.ch5.a.e2)

(defn -main []
    ;; output to file is a side effect - modify an external state
    (spit "hello.txt" "Hello!")

    ;; input from file is a side effect - depends from an external state
    (println (slurp "hello.txt"))

    ;; println has a side effect - changes the console
    ;; it is not referential transparent - its return value is nil, 
    ;;    but using nil instead of invoking it changes the program behavior
    (println "Welcome back!")
)
