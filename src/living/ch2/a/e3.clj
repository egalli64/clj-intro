;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Logic tests on collections: empty?, seq

;; empty? returns true if the collection is not empty
;; the argument should be a seqable
;; (println "Not empty:" (empty? :a))
(println "Not empty:" (empty? [:a]))
(println "Empty:" (empty? {}))
(println "Nil is seen in this context as an empty list:" (empty? nil))

;; the seq function returns a sequence view on the passed collection
(println "A vector:" (class [1 2 3]))
(println "A vector seen as a seq:" (class (seq [1 2 3])))
;; seq on a list returns the list itself
(println "A list is already a seq:" (class (seq '(1 2 3))))
(println "A seq from an empty collection is seen as nil:" (class (seq '())))

;; seq is used to check if a collection is empty
(println "Not empty by seq:" (seq [:a]))
(println "Empty by seq:" (not (seq {})))
