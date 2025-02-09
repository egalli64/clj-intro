;;; Function definition - in the global space at namespace level
;;
;; defn function-name "optional docstring" [list of parameters] function_body

(ns p2.ch3.c.e3)

;; my-hello expects a single argument
(defn my-hello "A function defined in the current namespace" [name]
    (println "Hello," name)
)

(defn -main "The main function for the current namespace" []
    (my-hello "Tom")
    ;; won't work: ArityException
    ;; (my-hello)
    ;; (my-hello "Tom" "Bob")
)
