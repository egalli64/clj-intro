;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; multilevel destructuring

;; a vector of vectors
(def pairs [[:monet :austen] [:beethoven :dickinson]])

;; the painter is first of first
(println "The painter is" (first (first pairs)))
;; the composer is first of second
(println "The composer is" (first (second pairs)))

;; same, by multilevel destructuring
(let [[[painter] [composer]] pairs]
  (println "The painter is" painter)
  (println "The composer is" composer))

;; using dummy
(let [[[painter] [_ poet]] pairs]
  (println "The painter is" painter)
  (println "The poet is" poet))
