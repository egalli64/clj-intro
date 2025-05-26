;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; ^:dynamic var and thread local binding

(ns getting.p3.ch17.c.e2)

;; a dynamic var
(def ^:dynamic *fav-book* "Oliver Twist")

(def fav-2001
  (Thread. #(binding [*fav-book* "2001"] (println (str "My favorite book is " *fav-book* "\n")))))
(def fav-emma
  (Thread. #(binding [*fav-book* "Emma"] (println (str "My favorite book is " *fav-book* "\n")))))

(defn -main []
  (.start fav-2001)
  (.start fav-emma)

  ;; simulate some task taking some time, so that the workers thread would complete in the meantime
  (Thread/sleep 1)

  (println "The main fav book is still" *fav-book*))
