;;; control flow: if

(ns b.e2)

(defn -main [] 
    (println (if true "That's true" "That's false"))
    (println (if false "If false you'll get nil!"))
)