;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Easy 4ever-clojure exercises
;; Problem 47, Contain Yourself
;; Check if a _key_ is present by the function contains?
;; https://4clojure.oxal.org/#/problem/47
;; (contains? #{4 5 6} __)
;; (contains? [1 1 1 1 1] __)
;; (contains? {4 :a 2 :b} __)
;; (not (contains? [1 2 4] __))

;; thinking ...

;; usually the key is the value
(println "For a set the key is the value:" (contains? #{:a :b :c} :a))
(println "For vector the key is the index:" (contains? [:a :b :c] 2))

;; contains? is not supported by list
(try (contains? '(:a :b :c) :a)
     (catch Exception e (println (.getMessage e))))

;; solution
(let [__ 4]
  (and (contains? #{4 5 6} __)
    (contains? [1 1 1 1 1] __)
    (contains? {4 :a 2 :b} __)
    (not (contains? [1 2 4] __))))
