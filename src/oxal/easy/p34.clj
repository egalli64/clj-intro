;; Problem 34, Implement range
;; Create a list of integer in the given range
;; (= (__ 1 4) '(1 2 3))
;; (= (__ -2 2) '(-2 -1 0 1))
;; (= (__ 5 8) '(5 6 7))

;; thinking ...
(println (range 1 4))

(let [rng (fn [begin end] (loop [cur (dec end), acc '()] (if (< cur begin) acc (recur (dec cur) (cons cur acc)))))]
  (println (rng 1 4)))

;; my solution
(def solution #(loop [cur (dec %2), acc '()] (if (< cur %1) acc (recur (dec cur) (cons cur acc)))))

;; verify it
(print "Is the problem solved? ")
(= (solution 5 8) '(5 6 7))