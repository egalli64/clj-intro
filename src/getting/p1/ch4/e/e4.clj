;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; case: check a single variable for equality

(ns getting.p1.ch4.e.e4)

(defn greeting [status]
  ;; check status against the constants provided :gold, ...
  (case status
    :gold "Welcome, welcome, welcome back!!!"
    :preferred "Welcome back!"
    ;; the last, unpaired, expression is the default
    "Welcome to Flourish and Blotts"))

(defn -main []
  (println (greeting :gold))
  (println (greeting :preferred))
  (println (greeting :whatever)))
