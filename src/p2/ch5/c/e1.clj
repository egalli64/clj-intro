;;; comp composes multiple functions into a single function
;;
;; It expects the functions having arity 1 (but the last one)
;; The functions are applied from right to left
;; It returns a function
;; ex: (comp f g h) creates a function that, when called, applies h, then g, then f

(ns p2.ch5.c.e1)

(defn -main []
    ;; three custom functions to be composed
    (defn increase [x] (+ x 1))
    (defn square [x] (* x x))
    (defn dbl [x] (* x 2))

    (def increase-double-square (comp square dbl increase))
    (println "3 increased, doubled, squared is" (increase-double-square 3))

    ;; compose anon functions on the fly
    (println "same (anon function)" ((comp #(* % %) #(* % 2) #(+ % 1)) 3))

    ;; composing standard functions/operators
    (println "2 * 3 then increased is" ((comp inc *) 2 3))
)
