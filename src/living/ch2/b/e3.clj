;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Destructuring sequences

(def names ["Tom" "Bob"])
(println "A sequence:" names)

;; destructuring a sequence in local bindings
(let [[first last] names] (println "The names are" first last))

;; same, without destructuring (more verbose)
(let [first (first names) last (last names)] (println "The names are" first last))

;; nested destructuring
(def names-2 ["Tom" ["Bob"]])
(let [[first [last]] names-2] (println "The names are" first last))

;; keeping the original by :as
(let [[first [last] :as original] names-2] (println "The names are" first last "from" original))
