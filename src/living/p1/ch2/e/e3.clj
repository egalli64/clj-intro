;;; For more info read Living Clojure by Carin Meier
;; Data transformation: map for zipping together collections

;; a couple of seqs
(def tags [:a :b :c])
(def codes [1 2 3])
(println "Original data:" tags codes)

;; a function that generates a pair
(defn make-pair [left right] [left right])
(println "Generate a pair:" (make-pair :x :y))

;; use map to zip together more seqs
(println "Zip two seqs in a seq of pairs:" (map make-pair tags codes))
;; the zipped seqs could have different sizes, someone could even be infinite!
(println "The shortest seq determines the result shape:" (map make-pair tags (range)))
