;;; take, drop, take-while, drop-while

(ns brave.p2.ch4.b.e5)

(defn -main []
    (let [data [1 2 3 4 5 6 7 8 9 10]]
        (println "Original data:" data)

        (println "Take 3:" (take 3 data))
        (println "Drop 3:" (drop 3 data))

        ;; stop taking when the lambda returns true
        (println "Take while < 5:" (take-while #(< % 5) data))
        ;; stop dropping when the lambda returns true
        (println "Drop while < 5:" (drop-while #(< % 5) data))
        ;; drop < 4, take < 7 to cut head and tail
        (println "Take in [4 .. 7):" (take-while #(< % 7) (drop-while #(< % 4) data)))
    )
)
