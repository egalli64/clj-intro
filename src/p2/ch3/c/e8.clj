;;; closure
;;
;; function that captures and retains access to variables from its defining scope, even after that scope has exited

(ns p2.ch3.c.e8)

;; a factory function
(defn increaser "Returns an increaser closure" [delta] #(+ % delta))

;; creating a closure
(def increase-3 (increaser 3))

(defn -main []
    ;; invoking a closure
    (println "Increasing 39 to" (increase-3 39))
)
