;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; if (else)

(ns getting.p1.ch4.a.e2)

;; a function expecting a conditional value
(defn greeting [preferred-customer]
  (if preferred-customer
    ;; if the parameter is truthy
    (println "Welcome back to Flourish and Blotts!")
    ;; otherwise
    (println "Welcome to Flourish and Blotts!")))

(defn -main []
  (greeting false)
  (greeting true))
