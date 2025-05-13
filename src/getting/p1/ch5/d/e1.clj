;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; simple recursion (no TCO)

(ns getting.p1.ch5.d.e1)

(def books
  [{:title "Jaws" :copies-sold 2000000}
   {:title "Emma" :copies-sold 3000000}
   {:title "2001" :copies-sold 4000000}])

(defn sum-copies
  ;; arity 1: initialize total to zero, call arity 2 overload
  ([books] (sum-copies books 0))
  ;; arity 2: recursion on books, accumulating in total
  ([books total]
   ;; base condition, collection empty, return the accumulated total
   (if (empty? books)
     total
     ;; otherwise call sum-copies recursively
     ;; discard the first item, use it to accumulate the partial result in total
     (sum-copies (rest books) (+ total (:copies-sold (first books)))))))

(defn -main []
  (println (sum-copies books)))
