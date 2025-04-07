;;; defmacro
;; manipulate a list before eval
(ns p2.ch7.c.e4)

;; a macro that discards the last element
(defmacro ignore-last [funcall] (butlast funcall))

(defn -main []
    ;; adding all but last one
    (println "W/out macro:" (+ 1 2 10))
    (println "W/ macro:" (ignore-last (+ 1 2 10)))
)