;;; the equality operator _=_

(ns brave.p2.ch3.a.e5)

(defn -main []
    ;; use = for comparison
    (println (if (= nil nil) "nil equals nil" "unexpected"))
    (println (if (= 42 nil) "unexpected" "42 is not equal to nil"))
    (println (if (= "black" "black") "black is black" "unexpected"))
)