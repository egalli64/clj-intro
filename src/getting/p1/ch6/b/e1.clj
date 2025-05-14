;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; anonymous function: fn

(ns getting.p1.ch6.b.e1)

;; bind an anonymous function to a symbol
(def double-it (fn [n] (* 2 n)))

(defn -main []
  ;; a function is a value, as any other value
  (println "A function (by def):" double-it)
  (println "A function (anonymously):" (fn [n] (* 2 n)))

  ;; invoking an anonymous function
  (println "Invoking a function (by def):" (double-it 21))
  (println "Invoking a function (anonymously):" ((fn [n] (* 2 n)) 21)))
