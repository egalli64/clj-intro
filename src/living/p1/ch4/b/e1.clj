;;; For more info read Living Clojure by Carin Meier
;; Polymorphism: cond for type dispatching

(defn process-verbose [input]
  (cond
    (= java.lang.String (class input)) (str "Processing string: " input)
    (= clojure.lang.Keyword (class input)) (str "Processing keyword: " input)
    (= clojure.lang.Symbol (class input)) (str "Processing symbol: " input)
    (= java.lang.Long (class input)) (str "Processing long: " input)
    :else (str "Processing an unknown object: " input)))

;; test the function
(let [mixed-bag ["hello" 123 :keyword 'symbol []]]
  (doseq [item mixed-bag] (println (process-verbose item))))
(println)

(defn process-alt [input]
  (cond
    (string? input) (str "Processing string: " input)
    (keyword? input) (str "Processing keyword: " input)
    (symbol? input) (str "Processing symbol: " input)
    (instance? Long input) (str "Processing long: " input)
    :else (str "Processing an unknown object: " input)))

;; test the function
(let [mixed-bag ["hello" 123 :keyword 'symbol []]]
  (doseq [item mixed-bag] (println (process-alt item))))
