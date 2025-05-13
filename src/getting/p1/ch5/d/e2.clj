;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; use recur for TCO

(ns getting.p1.ch5.d.e2)

(def books
  [{:title "Jaws" :copies-sold 2000000}
   {:title "Emma" :copies-sold 3000000}
   {:title "2001" :copies-sold 4000000}])

(defn sum-copies
  ([books] (sum-copies books 0))
  ([books total]
   ;; base condition, collection empty, return the accumulated total
   (if (empty? books)
     total
     ;; recursive call by recur
     (recur (rest books) (+ total (:copies-sold (first books)))))))

(defn -main []
  (println (sum-copies books)))
