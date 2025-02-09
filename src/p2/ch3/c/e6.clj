;;; destructuring in function parameters
;;
;; extraction of values from data structures to variables (here, parameters)
;; it works for list, vector, map, and nested structure

(ns p2.ch3.c.e6)

;; extract the first element from the passed collection
(defn print-first [[first]] (println "first is" first))

;; extract the first element from the passed collection, then more
(defn print-first-more [[first & more]] (println "first is" first "and then ..." more))

;; extract :x and :y value from the passed map
(defn print-pos [{x :x y :y}] (println (str "x=" x ", y=" y)))

;; same, but :keys matches map items to the variable; optional :as for the full map
(defn print-pos-2 [{:keys [x y] :as point}] (println (str "x=" x ", y=" y) "... the point:" point))

(defn -main []
    ;; passing an array
    (print-first [1 2 3])
    ;; passing a list
    (print-first '(1 2 3))
    ;; empty array, can't extract anything, nil is used instead
    (print-first [])

    ;; ArityException
    ;; (print-first)

    ;; UnsupportedOperationException
    ;; (print-first 42)

    ;; no first, no more
    (print-first-more [])
    ;; first, no more
    (print-first-more [1])
    ;; first, and more
    (print-first-more [1 2])

    ;; passing a map
    (print-pos {:x 42 :y 24})
    (print-pos-2 {:x 42 :y 24})
)
