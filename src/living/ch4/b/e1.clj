;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Polymorphism: cond for type dispatching

; for the most commonly used types are available predicates, see below
(defn process-verbose [input]
  (cond
    ; String, Long, ... are defined in the package java.lang.String, imported by default
    (= String (class input)) (str "Processing string: " input)
    (= Long (class input)) (str "Processing long: " input)
    (= clojure.lang.Keyword (class input)) (str "Processing keyword: " input)
    (= clojure.lang.Symbol (class input)) (str "Processing symbol: " input)
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
