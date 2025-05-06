;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Easy 4ever-clojure exercises
;; Problem 34, Implement range
;; Create a list of integer in the given range
;; https://4clojure.oxal.org/#/problem/34
;; (= (__ 1 4) '(1 2 3))
;; (= (__ -2 2) '(-2 -1 0 1))
;; (= (__ 5 8) '(5 6 7))

;; thinking ...
(println (range 1 4))                                       ; (1 2 3)

;; but range is not an acceptable solution ...
(let [my-range
      (fn [begin end]
        ;; the initial current value is the decremented end value
        ;; the accumulator is initialized with an empty list
        (loop [cur (dec end), acc '()]
          ;; we reached the end of the range, return the accumulator
          (if (< cur begin)
            acc
            ;; otherwise, loop recur decreasing the current value
            ;; after cons cur on the accumulator
            ;; working on a list is cheaper starting from the end
            (recur (dec cur) (cons cur acc)))))]
  ;; a smoke test
  (println (my-range 1 4)))                                 ; (1 2 3)

;; solution
(let [solution #(loop [cur (dec %2), acc '()] (if (< cur %1) acc (recur (dec cur) (cons cur acc))))]
  (print "Is the problem solved? ")
  (and (= (solution 1 4) '(1 2 3))
       (= (solution -2 2) '(-2 -1 0 1))
       (= (solution 5 8) '(5 6 7))))
