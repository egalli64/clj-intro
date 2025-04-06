;;; map, first, rest, cons functions
;; designed to work on sequences, work on seqable
;; they work on a collection, one element at a time
;; we use the right data structure for the current problem
;; still we work on it with these functions
;;
;; (map func seqable ...) applies func to the elements of seqable(s) and returns the values in a _lazy sequence_ 
;; (first seqable) returns the first element in the seqable
;; (rest seqable) returns a lazy sequence of all the elements but the first one
;; (cons item seqable) add item in first position and return a new lazy sequence (or a list)

(ns p2.ch4.a.e2)

(def input [1 2 3 4])

(defn -main []
    ;; map the input vector to a lazy seq by inc
    (let [numbers (map inc input)]
        (println "Mapping by inc" input "to a" (type numbers) numbers)
    )

    ;; generate a set from the vector, than maps it by inc as above 
    (let [a_set (set input)]
        (println "Mapping by inc" a_set "to" (map inc a_set))
    )

    ;; first
    (println "First element in" input "is" (first input))
    (println "First element in an empty seqable is" (first #{}))

    ;; rest
    (println "Rest of" input "is" (rest input))
    (println "Rest of an empty seqable is empty:" (rest #{}))

    ;; cons
    (println "Cons 0 to" input "leads to" (cons 0 input))
    (println "Cons 0 to an empty seqable leads to" (cons 0 #{}))
)
