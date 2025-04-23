;;; For more info read Living Clojure by Carin Meier
;; swap!

;; defining an atom
(def absolem (atom :caterpillar))
(println "Initial atom value is" @absolem)

;; swap! requires a (pure) function and an atom
;; the passed function accepts the current atom value and returns its next one
;; Clojure, using the Compare and Swap (CAS) approach ensures the change is applied atomically
;; In case of interference from another thread, Clojure executes again the function (retry) until it succeeds
(defn change [value]
  (case value
    :caterpillar :chrysalis
    :chrysalis :butterfly
    :butterfly))

;; using dotimes to loop in the imperative way
(dotimes [i 3]
  (swap! absolem change)
  (println (inc i) "- after swap! the value is" @absolem))
