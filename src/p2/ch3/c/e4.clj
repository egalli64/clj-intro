;;; Arity overloading
;;
;; a function could have more bodies, each associated with a different sized list of parameters

(ns p2.ch3.c.e4)

;; my-hello expects 0/1 argument
(defn my-hello "An overloaded function"
    ;; the zero-arity overload calls its one-arity overload
    ([] (my-hello "Unknown"))
    ;; the one-arity overload does the actual job
    ([name] (println (str "Hello, " name "!")))
)

(defn -main []
    (my-hello "Tom")
    (my-hello)
    ;; won't work: ArityException
    ;; (my-hello "Tom" "Bob")
)
