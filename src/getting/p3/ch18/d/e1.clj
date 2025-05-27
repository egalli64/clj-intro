;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; agent, await, shutdown-agents - changes with side effect

(ns getting.p3.ch18.d.e1)

(def by-title (agent {}))

(defn notify-inventory-change [key value]
  (println "Change in the inventory. Now" key "is associated to" value))

(defn add-book [{title :title :as book}]
  (send
    by-title
    (fn [by-title-map]
      (notify-inventory-change :add book)
      (assoc by-title-map title book))))

(defn -main []
  (println "Inventory at startup:" @by-title)
  (add-book {:title "War and Peace" :copies 25})

  (await by-title)  ; Wait for agent to finish
  (println "Current inventory:" @by-title)
  (shutdown-agents))
