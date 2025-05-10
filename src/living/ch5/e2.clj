;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Sample function for show how to test - see deps.edn and the test folder

(ns living.ch5.e2)

(defn double-it [x] (* 2 x))

(defn -main []
  (let [x 21]
    (println x "doubled is" (double-it x))))
