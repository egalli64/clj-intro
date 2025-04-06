;;; repeat generate a lazy seq of repeated elements
;;
;; (repeat x) for an infinite seq of x
;; (repeat n x) for a finite seq of x repeated n times

(ns p2.ch4.c.e2)

(defn -main []
    (println "repeat 3 hello:" (repeat 3 "hello"))
    (println "take 3 from infinite repeat hello:" (take 3 (repeat "hello")))
)
