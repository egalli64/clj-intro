;;; Function definition - in the global space at namespace level
;;
;; (defn function-name "optional docstring" [list of parameters] function_body)
;; the last form evaluated is implicitly returned to the caller

(ns brave.p2.ch3.c.e3)

;; hello expects a single argument, the last form is evaluated to nil
(defn hello "A function defined in the current namespace" [name] (println "Hello," name))

;; get in a value (a number), return a string
(defn check-negative "A function returning a string" [x] (if (< x 0) "negative" "non negative"))

(defn -main "The main function for the current namespace" []
    ;; the hello function returns nil
    (println (hello "Tom"))

    ;; won't work: ArityException
    ;; (hello)
    ;; (hello "Tom" "Bob")

    (println (check-negative -23))
    (println (check-negative 42))
)
