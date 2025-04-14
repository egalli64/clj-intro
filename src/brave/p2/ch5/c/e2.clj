;;; memoize wraps a function and caches its results in memory
;;
;; It should be used on pure functions (and beware of cache size)

(ns brave.p2.ch5.c.e2)

;; the actual function
(defn square [x]
  ;; simulation of an expensive operation
  (println "Called on" x)
  (* x x))

(defn -main []
  ;; memoized wrap
  (let [square-memo (memoize square)]
    (println "Result is:" (square-memo 5))
    (println "Result is:" (square-memo 5))
    (println "Result is:" (square-memo 6))
    (println "Result is:" (square-memo 6))
    (println "Result is:" (square-memo 5))))