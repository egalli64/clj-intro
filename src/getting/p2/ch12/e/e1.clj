;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; map destructuring

;; a map
(def artist-map {:painter :monet :novelist :austen})

;; get a map, extract values binding them to symbols locally used
;; notice that, being a map, the order of definition is not important
(let [{painter :painter, writer :novelist} artist-map]
  (println "The painter is" painter)
  (println "The novelist is" writer))
