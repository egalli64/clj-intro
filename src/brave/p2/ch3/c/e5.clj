;;; Variadic function
;;
;; a function could accept a variable number of arguments
;; the varargs variable is a list, prefixed by '&'
;; often called "more" (or "rest", ...)

(ns brave.p2.ch3.c.e5)

;; my-hello expects a variable (2+) number argument
(defn my-hello "A variadic function" [a b & more]
  ;; the first two parameters are mandatory
  (print (str "Hello, " a ", " b))

  ;; if the more list is not empty, print it, otherwise just EOL
  ;; seq access a collection as a sequence (or nil) commonly used to check if it is not empty
  (if (seq more)
    (println ", ... and" more)
    (println)))

(defn -main []
  (my-hello "Tom" "Bob")
  (my-hello "Tom" "Bob" "Kim" "Tim"))
  ;; won't work: ArityException (two arguments are mandatory)
  ;; (my-hello)
  ;; (my-hello "Tom")