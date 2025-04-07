;;; reduce for filtering

(ns brave.p2.ch4.b.e4)

(defn -main []
    (let [data {:min 3 :max 5}]
        (println "Original data:" data)
        ;; the lambda assoc the pair only if the values is accepted
        ;; reduce invokes the lambda for each pair in data, accumulating from an empty map
        (println "reduce - assoc to filter:" (reduce (fn [acc [k v]] (if (> v 4) (assoc acc k v) acc)) {} data))

        ;; same, by into - filter
        (println "into - filter:" (into {} (filter (fn [[_ v]] (> v 4)) data)))
    )
)
