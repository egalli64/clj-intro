;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Destructuring parameters - a help to document their structure

;; a simple function
(defn friend-names [names]
  (str "The friend names are " (:name1 names) " and " (:name2 names)))

(println (friend-names {:name1 "Tom" :name2 "Bob"}))

;; destructuring its parameter could make it more readable
(defn friend-names-2 [{:keys [name1 name2]}]
  (str "The friend names are " name1 " and " name2))

(println (friend-names-2 {:name1 "Tom" :name2 "Bob"}))
