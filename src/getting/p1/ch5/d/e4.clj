;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; let standard functions do the dirty job (here: apply and map)

(ns getting.p1.ch5.d.e4)

(def books
  [{:title "Jaws" :copies-sold 2000000}
   {:title "Emma" :copies-sold 3000000}
   {:title "2001" :copies-sold 4000000}])

(defn sum-copies [books] (apply + (map :copies-sold books)))

(defn -main []
  (println (sum-copies books)))
