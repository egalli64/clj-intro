;;; defmacro
(ns brave.p2.ch7.a.e1)

;; define a macro
(defmacro backwards [form] (reverse form))

(defn -main []
    (println
        ;; invoking the backwars macro that works backwards :O
        ;; uncomment it to check it - lint sees it as an error
        ;; (backwards (" backwards" " am" "I" str))
     )
)
