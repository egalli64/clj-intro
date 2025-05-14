;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; a combiner as high order function

;; a book
(def dracula {:title "Dracula", :author "Stoker", :price 1.99, :genre :horror})

;; predicates to be used on books (assuming no missing keys in books)
(defn cheap? [book] (<= (:price book) 9.99))
(println "Is" (:title dracula) "cheap?" (cheap? dracula))

(defn pricey? [book] (> (:price book) 9.99))
(println "Is pricey?" (pricey? dracula))

(defn horror? [book] (= (:genre book) :horror))
(println "Is a horror book?" (horror? dracula))

(defn adventure? [book] (= (:genre book) :adventure))
(println "Is an adventure book?" (adventure? dracula))

;; instead of defining a new function, we can create an alias
(def reasonably-priced? cheap?)
(println "Is reasonably priced?" (reasonably-priced? dracula))

;; we can pass a function to a function (High Order Function)
(defn run-with-dracula [f] (f dracula))
(println "Is a horror book?" (run-with-dracula horror?))

;; combine two predicates to generate a new one
(defn both? [first-predicate second-predicate book] (and (first-predicate book) (second-predicate book)))
(println "Is both cheap and horror?" (both? cheap? horror? dracula))
