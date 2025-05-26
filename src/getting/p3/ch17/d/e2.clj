;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; future: promise, deliver, deref (or @)

(ns getting.p3.ch17.d.e2)

(def inventory [{:title "Emma" :sold 51 :revenue 255} {:title "2001" :sold 17 :revenue 170}
                ;; Lots and lots of books...
                ])

(defn sum-copies-sold [inv] (apply + (map :sold inv)))

(defn sum-revenue [inv] (apply + (map :revenue inv)))

(defn -main []
  ;; 1. the main thread set the promises
  (let [copies-promise (promise) revenue-promise (promise)]
    ;; 2. each child thread delivers the result
    (.start (Thread. #(deliver copies-promise (sum-copies-sold inventory))))
    (.start (Thread. #(deliver revenue-promise (sum-revenue inventory))))

    ;; Do some other stuff in this thread...
    (Thread/sleep 1)

    ;; 3. the main thread hangs until the promises are fulfilled
    (println "The total number of books sold is" (deref copies-promise))
    (println "The total revenue is" @revenue-promise)))
