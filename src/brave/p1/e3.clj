;;; Using functions: +, *, first
;; clj -M -m brave.p1.e3
(ns brave.p1.e3)

;; return the sum of the values
(defn -main []
	(println "Adding values:" (+ 8 14 20))
	(println "Multiplying values:" (* 2 7 3))
	(println "Getting the first value of a vector:" (first [4 5 3 2]))
)
