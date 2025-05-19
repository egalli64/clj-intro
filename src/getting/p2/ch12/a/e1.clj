;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; the [] destructuring pattern

;; a collection
(def artists [:monet :austen :beethoven :dickinson])

;; destructuring by hand
(let [painter (first artists) novelist (second artists)]
  (println "The painter is:" painter "and the novelist is" novelist))

;; same, but through the destructuring pattern
;; match the symbols in the vector with the corresponding values in the following collection
(let [[painter novelist] artists]
  (println "The painter is:" painter "and the novelist is:" novelist))

;; destructuring could involve some or all the elements in the collection
(let [[painter novelist composer poet] artists]
  (println "The painter is" painter)
  (println "The novelist is" novelist)
  (println "The composer is" composer)
  (println "The poet is" poet))
