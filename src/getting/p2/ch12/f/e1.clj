;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; multilevel map destructuring

;; a multilevel map
(def austen {:name    "Jane Austen"
             :parents {:father "George", :mother "Cassandra"}
             :dates   {:born 1775, :died 1817}})

;; from the map austen extract the item with key :parents
;; from that item extract the values associated to :father and :mother
(let [{{dad :father, mom :mother} :parents} austen]
  (println "Jane Austen dad's name was" dad)
  (println "Jane Austen mom's name was" mom))

;; from the map austen extract
;;  the value associated to the key :name (in the symbol name)
;;  the item associated to the key :parents,
;;   and from it the value associated to the key :mother (in the symbol mom)
;;  the item associate to the key :dates,
;;   and from it the value associated to the key :born (in the symbol dob)
(let [{name          :name
       {mom :mother} :parents
       {dob :born}   :dates} austen]
  (println name "was born in" dob)
  (println name "mother's name was" mom))
