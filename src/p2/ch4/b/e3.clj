;;; reduce to map (function) a map (data structure)

(ns p2.ch4.b.e3)

(defn -main []
    (let [data {:min 10 :max 20}]
        (println "The original data:" data)

        ;; takes an accumulator and a map entry
        (defn increase-values [acc [k v]] (
            ;; assoc to the accumulator the new entry with increased value
            assoc acc k (inc v)
        ))
        ;; call reduce to add all the entries in data to a new map (with value increased)
        (println "Use reduce-assoc to increase values:" (reduce increase-values {} data))

        ;; same, anonymous function by fn
        (println "Same, lambda by fn:" (reduce (fn [acc [k v]] (assoc acc k (inc v))) {} data))

        ;; same, anonymous function by #()
        (println "Same, lambda by #():" (reduce #(assoc %1 (first %2) (inc (second %2))) {} data))

        ;; same, by into - map
        (println "into - map:" (into {} (map (fn [[k v]] [k (inc v)]) data)))

        ;; same, by update-vals
        (println "update-vals:" (update-vals data inc))
    )
)
