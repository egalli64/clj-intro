;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; destructuring map with vector in it

;; a map with a vector in it
(def author {:name  "Jane Austen"
             :books [{:title "Sense and Sensibility", :published 1811}
                     {:title "Emma", :published 1815}]})

;; from the map (author)
;;  get the value associated to the key :name and bind it to the symbol name
;;  get the value associated to the key :books (it is a vector)
;;    do not care about its first item, bind the second one to the symbol book
(let [{name :name, [_ book] :books} author]
  (println "The author is" name)
  (println "One of their books is" book))
