;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (empty? collection)

;; true if the collection is empty (or nil)
(empty? [])
(empty? nil)

;; false if non-empty
(empty? [42])

;; to check if a seq is empty is idiomatic a call to the seq function
(let [coll []]
  ;; considered idiomatic
  (if (seq coll) (println "First element is" (first coll)) (println coll "is empty"))
  ;; same behavior
  (if (not (empty? coll)) (println "First element is" (first coll)) (println coll "is empty")))
