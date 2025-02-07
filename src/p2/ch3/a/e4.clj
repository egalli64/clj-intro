;;; nil, true, false
;; the function nil? check if its argument is nil

(ns p2.ch3.a.e4)

(defn -main []
    ;; only nil is nil
    (println (if (nil? false) "unexpected" "false is not nil"))
    (println (if (nil? nil) "only nil is nil" "unexpected"))

    ;; in conditional context nil is considered false (falsey)
    (println (if nil "unexpected" "nil is falsey"))

    ;; in conditional context anything else than false and nil is considered true (truthy)
    (println (if 0 "zero is truthy" "unexpected"))
)