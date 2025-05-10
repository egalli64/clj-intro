;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; send and send-off

;; defining an agent
(def absolem (agent :caterpillar))
(println "Initial agent value is" @absolem)

;; same function used to swap! an atom
(defn change [value]
  (case value
    :caterpillar :chrysalis
    :chrysalis :butterfly
    :butterfly))

;; being send on agent asynchronous, we _eventually_ see the new value
(dotimes [i 5]
  (send absolem change)
  (println (inc i) "- after send the value is" @absolem))

(println)
;; no reset on agent, use send instead
(send absolem (fn [_] :caterpillar))
(dotimes [i 2]
  (println (inc i) "- after 'reset' the value is" @absolem))

(println)
;; being send-off designed for managing blocking operations is more expensive
(dotimes [i 5]
  (send-off absolem change)
  (println (inc i) "- after send-off the value is" @absolem))
