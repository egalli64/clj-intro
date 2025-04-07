;;; referential transparency: an expression can be replaced with its value without changing the program’s behavior
;;
;; a pure function supports referential transparency
;; it always produces the same output for the same input without side effects

(ns brave.p2.ch5.a.e1)

(defn -main []
    ;; * is a pure function, given the same input produce always the same result
    (println "6 * 7 is (always)" (* 6 7))

    ;; rand - with no seed - is not pure, since it could return each time a different values
    ;; no referential transparency
    (println "with rand we expect each time a different value:" (rand))
)
