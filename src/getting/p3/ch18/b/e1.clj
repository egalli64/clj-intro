;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; atom could trick you in believing a map is a mutable object
(ns getting.p3.ch18.b.e1)

;; a map having :title as key and the book as value
(def by-title (atom {}))
;; add/remove pair on the map, is actually swapping the old map with the result of assoc/dissoc on it
(defn add-book [{title :title :as book}] (swap! by-title #(assoc % title book)))
(defn del-book [title] (swap! by-title #(dissoc % title)))
(defn find-book [title] (get @by-title title))

(defn -main []
  (println "Starting with an empty map:" @by-title)
  (println "Can't get Emma from an empty map:" (find-book "Emma"))
  (add-book {:title "1984", :copies 1948})
  (println "After adding 1984:" @by-title)
  (add-book {:title "Emma", :copies 100})
  (println "After adding Emma:" @by-title)
  (del-book "1984")
  (println "After deleting 1984:" @by-title)
  (println "Get Emma from the map:" (find-book "Emma"))
  (println "Can't get 1984 from this map:" (find-book "1984")))
