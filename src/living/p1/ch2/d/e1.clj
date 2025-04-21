;;; For more info read Living Clojure by Carin Meier
;; Recursion: traversing a seq

(def adjectives ["normal" "small" "big" "swimming"])
(println "A seq:" adjectives)

;; process the input data, accumulate the results in acc
(defn make-ish [xs acc]
  ;; if xs is empty we are done
  ;; otherwise, call recursively the function
  ;;    on the rest, and the conjed accumulator with the processed first input element
  (if (empty? xs) acc (make-ish (rest xs) (conj acc (str (first xs) "ish")))))

;; start the recursion providing the input seq and where to place the output
(println (make-ish adjectives []))

;; room for improvements:
;; (1) hide the accumulator to the caller
;; (2) Clojure do not perform automatic Tail Call Optimization (TCO) on recursion
