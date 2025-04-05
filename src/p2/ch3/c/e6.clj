;;; destructuring in function parameters
;;
;; extraction of values from data structures to variables (here, parameters)
;; it works for list, vector, map, and nested structure

(ns p2.ch3.c.e6)

;; extract the first element from the passed collection
(defn print-first [[first]] (
    println "first is" first)
)

;; extract the first element from the passed collection, then more
(defn print-first-more [[first & more]] (
    println "first is" first "and then ..." more)
)

;; extract :x and :y value from the passed map
(defn print-pos [{x :x y :y}] (
    println (str "x=" x ", y=" y))
)

;; same, but :keys matches map items to the variable; optional :as for the full map
(defn print-pos-2 [{:keys [x y] :as point}] (
    println (str "x=" x ", y=" y) "... the point:" point)
)

(defn -main []
    (print "passing a non-empty vector to print-first: ")
    (print-first [1 2 3]) ; 1

    (print "passing a non-empty list to print-first: ")
    (print-first '(1 2 3)) ; 1

    (print "passing an empty vector to print-first: ")
    (print-first []) ; nil

    ;; ArityException
    ;; (print-first)

    ;; UnsupportedOperationException
    ;; (print-first 42)

    (print "passing an empty vector to print-first-more: ")
    (print-first-more []) ; nil .. nil

    (print "passing a single-element vector to print-first-more: ")
    (print-first-more [1]) ; 1 .. nil

    (print "passing a two-element vector to print-first-more: ")
    (print-first-more [1 2]) ; 1 .. 2

    ;; passing a map
    (print-pos {:x 42 :y 24})
    (print-pos-2 {:x 42 :y 24})
)
