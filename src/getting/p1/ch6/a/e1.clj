;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; a combiner as high order function

(ns getting.p1.ch6.a.e1)

;; a book
(def dracula {:title "Dracula", :author "Stoker", :price 1.99, :genre :horror})

;; predicates to be used on books (assuming no missing keys in books)
(defn cheap? [book] (<= (:price book) 9.99))
(defn pricey? [book] (> (:price book) 9.99))
(defn horror? [book] (= (:genre book) :horror))
(defn adventure? [book] (= (:genre book) :adventure))

;; instead of defining a new function, we can create an alias
(def reasonably-priced? cheap?)

;; we can pass a function to a function (High Order Function)
(defn run-with-dracula [f] (f dracula))

;; combine two predicates to generate a new one
(defn both? [first-predicate second-predicate book] (and (first-predicate book) (second-predicate book)))

(defn -main []
  (println "Considering:" dracula)
  (println "Is cheap?" (cheap? dracula))
  (println "Is pricey?" (pricey? dracula))
  (println "Is a horror book?" (horror? dracula))
  (println "Is an adventure book?" (adventure? dracula))

  ;; calling the alias to cheap?
  (println "Is reasonably priced?" (reasonably-priced? dracula))

  ;; calling the HOF
  (println "Is a horror book?" (run-with-dracula horror?))

  ;; calling the combinator function
  (println "Is both cheap and horror?" (both? cheap? horror? dracula)))
