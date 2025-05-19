;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; reimplementing map

;; accept a function (inc) and a collection on which applying the function
(defn my-map [f col]
  ;; go on looping until the collection is empty
  (when-not (empty? col)
    ;; the current value to be provided to the caller is the result of applying the function to the first item
    (cons (f (first col))
          ;; the next request is served by a recursive call using the same mapping function on the collection rest
          (lazy-seq (my-map f (rest col))))))

(my-map inc [1 2 3])
(map inc [1 2 3])
