;;; For more info read Living Clojure by Carin Meier
;; Currying with partial as function factory

;; a simple function
(defn grow [name direction]
  (if (= direction :small)
    (str name " is growing smaller")
    (str name " is growing bigger")))

(println (grow "Alice" :small))
(println (grow "Bob" :big))

;; partial wraps the original function, providing arguments _on the left_
(def alice-grow (partial grow "Alice"))
(println (alice-grow :small))

;; to curry in a free way use an anon function instead
(def grow-big #(grow % :big))
(println (grow-big "Jane"))
