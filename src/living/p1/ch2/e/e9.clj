;;; For more info read Living Clojure by Carin Meier
;; Data transformation: partition, partition-all, partition-by

(def data-9 (range 1 10))
(println "The original data (9 elements)" data-9)

;; partition (no loss - 3 groups of 3 elements)
(println "Data partitioned by 3:" (partition 3 data-9))

(def data-10 (conj data-9 0))
(println "The original data (10 elements)" data-10)
;; partition (with loss - 3 groups of 3 elements, last element discarded)
(println "Data partitioned by 3 (last element lost!):" (partition 3 data-10))

;; partition-all (last group could by shorter than the other ones)
(println "Data partitioned by 3 (last element alone):" (partition-all 3 data-10))

;; partition-by
(println "Data partitioned by threshold (mantaining their order):" (partition-by #(< % 5) data-10))
