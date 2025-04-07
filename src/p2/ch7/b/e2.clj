;;; read-string macro resolving to explicit form
(ns p2.ch7.b.e2)

(defn -main []
    ;; shorthand conversion
    (println (read-string "#(+ 1 %)"))
    (println (read-string "'(a b c)"))
    (println (read-string "@var"))
    ;; ignoring comments
    (println (read-string "; ignore!\n(+ 1 2)"))
)
