;;; repeatedly generates a lazy seq invoking repeatedly a function
;;
;; (repeatedly func) for an infinite seq by calling func
;; (repeatedly n func) for a finite seq calling func n times

(ns brave.p2.ch4.c.e3)

(defn -main []
    (println "repeatedly 10 calls of rand-int for [0..2):" (repeatedly 10 #(rand-int 2)))
    (println "take 3 from repeatedly infinite call rand:" (take 3 (repeatedly rand)))
)
