;;; concat
;; (concat seqable seqable) concatenate the two seqables in a new lazy sequence

(ns p2.ch4.b.e8)

(defn -main []
    (println "concat gives:" (concat [1 2] [3 4]))
)
