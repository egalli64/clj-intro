;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; No mutability no race condition

(ns getting.p3.ch17.c.e1)

;; a var
(def fav-book "Jaws")

(defn make-emma-favorite []
  (let [my-fav-book "Emma"]
    (println (str "Global fav is: " fav-book ", thread local fav is: " my-fav-book "\n"))))

(defn make-2001-favorite []
  (let [my-fav-book "2001"]
    (println (str "Global fav is: " fav-book ", thread local fav is: " my-fav-book "\n"))))

(defn -main []
  (.start (Thread. make-emma-favorite))
  (.start (Thread. make-2001-favorite))

  ;; simulate some task taking some time, so that the workers thread would complete in the meantime
  (Thread/sleep 1)

  (println "The main fav book is still:" fav-book))
