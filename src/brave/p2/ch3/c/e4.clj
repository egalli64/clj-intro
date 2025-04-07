;;; Arity overloading
;;
;; a function could have more bodies, each associated with a different sized list of parameters

(ns brave.p2.ch3.c.e4)

;; hello expects 0/1 argument
(defn hello "An overloaded function"
    ;; the zero-arity overload calls its one-arity overload
    ([] (hello "Unknown"))
    ;; the one-arity overload does the actual job
    ([name] (println (str "Hello, " name "!")))
)

;; 1/2/3 arguments
(defn add "Another overloaded function"
    ;; nothing to add
    ([x] x)

    ;; I don't want more than three arguments
    ([x y] (+ x y))
    ([x y z] (+ x y z))
)

(defn -main []
    (hello "Tom")
    (hello)
    ;; won't work: ArityException
    ;; (hello "Tom" "Bob")

    (println (add 1))
    (println (add 1 2))
    (println (add 1 2 3))
    ;; won't work: ArityException
    ;; (println (add 1 2 3 4))
)
