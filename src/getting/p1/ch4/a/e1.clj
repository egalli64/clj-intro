;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; if

(ns getting.p1.ch4.a.e1)

;; a function expecting a conditional value
(defn greeting [preferred-customer]
  ;; only if the parameter is truthy the message is printed
  (if preferred-customer
    (println "Welcome back to Flourish and Blotts!")))

(defn -main []
  (greeting 42)
  (greeting nil)
  ;; passing a boolean would make the code more clear
  (greeting true))
