;;; range - generates a lazy sequence of numbers
;;
;; (range) generate the natural sequence (starting from 0) - notice that it is infinite!
;; (range end) generate a sequence starting from 0 up to end (excluded)
;; (range start end) sequence in [start .. end)
;; (range start end step) the step rules the increment (default is 1)

(ns p2.ch4.c.e1)

(defn -main []
    ;; being lazy, a range generation is relatively cheap
    (print "timing the generation of 1 million range: ")
    (time (range 0 1000000))

    ;; infinite range requires a limit!
    (println "Take first 6 from an inifinite range:" (take 6 (range)))

    ;; range end
    (println "Range [0 .. 6) is" (range 6))

    ;; range start end
    (println "Range [2 .. 6) is" (range 2 6))

    ;; range start end step
    (println "Range [2 .. 10) step 2 is" (range 2 10 2))
)
