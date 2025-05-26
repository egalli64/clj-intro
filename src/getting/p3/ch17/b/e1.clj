;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; Race condition: threads competing on a shared resource

(ns getting.p3.ch17.b.e1)

;; a var
(def fav-book "Jaws")

;; resetting a var! (do not do this in production code)
(defn make-emma-favorite [] (def fav-book "Emma"))

;; resetting the same var! (actively looking for troubles)
(defn make-2001-favorite [] (def fav-book "2001"))

(defn -main []
  (.start (Thread. make-emma-favorite))
  (.start (Thread. make-2001-favorite))

  ;; simulate some task taking some time, so that the workers thread would complete in the meantime
  (Thread/sleep 1)

  ;; unpredictable result! (even though we would guess to get 2001)
  (println fav-book))
