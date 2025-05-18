;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; reduce

(def numbers [10 20 30 40 50])

;; sum up all the elements (by apply)
(apply + numbers)

;; sum up all the elements (by reduce)
;; providing the initial value for the accumulator
;; the reducer should be defined for arity 2 and the collection should be non-empty
(reduce + 0 numbers)
;; if the reducer is overloaded for arity 1 and the collection is non-empty
(reduce + numbers)
;; works correctly because + has an overload for arity 0
(reduce + nil)
