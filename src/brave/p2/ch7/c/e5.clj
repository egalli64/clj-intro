;;; macroexpand
;; expand but do not eval
(ns brave.p2.ch7.c.e5)

;; a macro that discards the last element
(defmacro ignore-last [funcall] (butlast funcall))

(defn -main []
    ;; a standard macro
    (println (macroexpand '(when test (println "hi"))))

    ;; a custom macro, namespace is required
    (println (macroexpand '(p2.ch7.c.e5/ignore-last (+ 1 2 10))))
)
