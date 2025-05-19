;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; the idiomatic dummy symbol _

;; a collection
(def artists [:monet :austen :beethoven :dickinson])

(let [[_ _ composer poet] artists]
  (println "Here, I don't care about" _ "(and I should not use _, being it a dummy!)")
  (println "The composer is" composer)
  (println "The poet is" poet))
