;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; a closure

(ns getting.p1.ch6.b.e2)

;; a book
(def dracula {:title "Dracula", :author "Stoker", :price 1.99, :genre :horror})

;; a closure is a function factory that "closes over" a variable
;; this one is a closure on the parameter price
(defn cheaper-than [price]
  (fn [book] (< (:price book) price)))

;; helpers based on the closure above
(def real-cheap? (cheaper-than 1.00))
(def kind-of-cheap? (cheaper-than 2.00))
(def marginally-cheap? (cheaper-than 6.00))

(defn -main []
  (println "Considering:" dracula)
  (println "Is real cheap?" (real-cheap? dracula))
  (println "Is kind of cheap?" (kind-of-cheap? dracula))
  (println "Is marginally cheap?" (marginally-cheap? dracula)))
