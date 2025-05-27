;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; ref, dosync, alter
(ns getting.p3.ch18.c.e1)

(def by-title (ref {}))
(def total-copies (ref 0))

(defn add-book [{title :title :as book}]
  (dosync
    (alter by-title #(assoc % title book))
    (alter total-copies + (:copies book))))

(defn -main []
  (println "Starting with an empty map:" @by-title)
  (println "Number of copies:" @total-copies)

  (add-book {:title "1984", :copies 1948})
  (add-book {:title "Emma", :copies 100})

  (println "Current inventory:" @by-title)
  (println "Number of copies:" @total-copies))
