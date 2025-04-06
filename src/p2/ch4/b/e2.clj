;;; assoc: add/modify a key/value pair in collection supporting key/value lookup
;;
;; mainly meant to work on a map, can work with limitation on a vector
;; basic syntax: (assoc coll key val ...)

(ns p2.ch4.b.e2)

(defn -main []
    ;; assoc on a map
    (let [data {:a 1 :b 2}]
        (println "Original data:" data)
        ;; new map with a new pair in it
        (println "add:" (assoc data :c 3))
        ;; new map with a modified pair in it
        (println "modify:" (assoc data :b 42))
        ;; new map with a modified pair and a new one in it
        (println "add and modify:" (assoc data :a 11 :c 33))

        (println "Original data is still:" data "\n")
    )

    ;; assoc on a vector
    (let [data [1 2]]
        (println "Original data:" data)
        ;; new vector with a new item in it
        (println "assoc at index 2 value 3:" (assoc data 2 3))
        ;; won't work: IndexOutOfBoundsException - no holes in a vector
        ;; (println "assoc at index 3 value 4:" (assoc data 3 4))
        ;; new vector with a modified item in it
        (println "assoc at index 1 value 42:" (assoc data 1 42))
        ;; new vector with a modified item and a new one in it
        (println "add and modify:" (assoc data 1 11 2 22))

        (println "Original data is still:" data)
    )
)
