;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; another closure

;; a couple of books
(def dracula {:title "Dracula", :author "Stoker", :price 1.99, :genre :horror})
(def possession {:title "Possession", :author "Byatt", :price 9.99, :genre :historical})

;; a closure over two predicates
(defn both [predicate-1 predicate-2]
  (fn [book] (and (predicate-1 book) (predicate-2 book))))

;; some basic predicates
(defn cheap? [book] (< (:price book) 10.00))
(defn horror? [book] (= (:genre book) :horror))
(defn historical? [book] (= (:genre book) :historical))

;; a predicate based on the "both" closure
(def cheap-horror? (both cheap? horror?))
(println "Is" (:title dracula) "a cheap horror?" (cheap-horror? dracula))

;; another predicate based on the "both" closure
(def cheap-historical? (both cheap? historical?))
(println "Is" (:title possession) "a cheap historical?" (cheap-historical? possession))

;; a bit more complex predicate
(def cheap-historical-possession?
  (both cheap-historical? (fn [book] (= (:title book) "Possession"))))
(println "Is" (:title possession) "a cheap historical 'Possession'?" (cheap-historical-possession? possession))
