;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; when - like an if-do, no "else" branch

(ns getting.p1.ch4.d.e3)

(defn welcome [preferred-customer]
  (when preferred-customer
    (println "Hello returning customer!")
    (println "Welcome back to Flourish and Blotts!")))

(defn -main []
  (welcome true)
  (welcome false))
