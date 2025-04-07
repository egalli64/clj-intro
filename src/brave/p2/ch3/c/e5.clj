;;; Variadic function
;;
;; a function could accept a variable number of arguments
;; the varargs variable is a list, prefixed by '&'
;; often called "more" (or "rest", ...)

(ns brave.p2.ch3.c.e5)

;; my-hello expects a variable (2+) number argument
(defn my-hello "A variadic function" [a b & more]
    ;; the first two, mandatory, parameters
    (print (str "Hello, " a ", " b))
    ;; if the more list is not empty, print it
    ;; seq access a collection as a sequence (or nil)
    ;; commonly used to check if it is not empty
    (if (seq more) (print ", ... and" more))
    ;; in any case, EOL
    (println)
)

(defn -main []
    (my-hello "Tom" "Bob")
    (my-hello "Tom" "Bob" "Kim" "Tim")
    ;; won't work: ArityException (two arguments are mandatory)
    ;; (my-hello)
    ;; (my-hello "Tom")
)
