;;; function composition instead of attribute mutation
;;
;; better create a new object instead of mutate an existing one

(ns p2.ch5.b.e2)

(defn -main []
    (let [data [1 2 3 4]]
        ;; increase each value in the vector, then square each value
        (println "Generated result:" (map #(* % %) (map inc data)))
        ;; the original value is not changed
        (println "Original data:" data)
    )
)
