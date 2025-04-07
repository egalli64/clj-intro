;;; reduce - high order function that reduces a collection to a single value
;;
;; basic syntax: (reduce func coll)
;; with an explicit initial value: (reduce func init coll)
;;
;; the function gets the accumulator and the next item in the collection, and return the new accumulator

(ns brave.p2.ch3.d.e5)

(defn -main []
    (let [xs [1 2 3 2 1]]
        (print "reducing " xs " by + ... ")
        ;; no init, the accumulator is initialized by the first element
        (println (reduce + xs))

        (print "providing init 10 ... ")
        (println (reduce + 10 xs))

        ;; reducing an empty collection returns the identity for the applied function (or ArityException)
        (print "reducing [] on + gives ... ")
        (println (reduce + []))

        (print "reducing [] on with init + gives ... ")
        (println (reduce + 10 []))

        (print "reducing my max ... ")
        (println (reduce max xs))

        (print "reducing my max with init ... ")
        (println (reduce max 42 xs))

        ;; won't work: ArityException
        ;; (println (reduce max []))
    )
)