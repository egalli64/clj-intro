;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; destructuring a list

(def artist-list '(:monet :austen :beethoven :dickinson))

(let [[painter novelist composer] artist-list]
  (println "The painter is" painter)
  (println "The novelist is" novelist)
  (println "The composer is" composer))
