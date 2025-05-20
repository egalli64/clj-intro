;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; destructuring vector with maps in it

(def authors [{:name "Jane Austen" :born 1775}
              {:name "Charles Dickens" :born 1812}])

;; get the vector (authors)
;;  from the first item (a map)
;;   extract the value associated to the key :born and bind it to the symbol dob-1
;;  from the second item (a map)
;;   extract the value associated to the key :born and bind it to the symbol dob-2
(let [[{dob-1 :born} {dob-2 :born}] authors]
  (println "One author was born in" dob-1)
  (println "The other author was born in" dob-2))
