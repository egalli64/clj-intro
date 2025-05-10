;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; macroexpand-1

(ns living.ch8.e1)

(defn -main []
  (when (= 2 2) (println "Two and two ...") (println "It is four!"))
  (println (macroexpand-1 '(when (= 2 2) (println "Two and two ...") (println "It is four!")))))
