;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; future

(ns getting.p3.ch17.e.e1)

(def inventory [{:title "Emma" :sold 51 :revenue 255} {:title "2001" :sold 17 :revenue 170}
                ;; Lots and lots of books...
                ])

;; another thread starts here, as the future is created
(def revenue-future (future (apply + (map :revenue inventory))))

(defn -main []
  ;; if required, hang until the future is realized
  (println "The total revenue is" @revenue-future))
