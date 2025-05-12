;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; no "else" implies nil!

(ns getting.p1.ch4.a.e4)

;; probably a mistake: when passed falsey returns nil
(defn greeting [preferred-customer]
  (if preferred-customer "So nice to have you back!"))

(defn -main []
  (println (greeting false))
  (println (greeting true)))
