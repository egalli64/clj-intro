;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (seq collection)
;; generate a seq from the passed collection - or nil

;; empty collections are turned into nil
(seq [])
(seq "")
;; nil is considered as an empty list
(seq nil)

;; any (seqable) collection supports it
(seq [:a :b :c :d :e])
(seq {:a 1 :b 2 :c 3 :d 4 :e 5})
(seq #{:a :b :c :d :e})
(seq "hello")
;; invoked on a list returns the list itself (a list is-a seq)
(type (seq '(:a :b :c :d :e)))

;; when invoked on a lazy seq, it keeps the laziness
(type (seq (map inc [1 2 3])))

;; idiomatically used to check if the seq is empty or not (since nil is falsy)
(let [coll [42]] (when (seq coll) (println "The collection" coll "is not empty")))
(let [coll {}] (when (not (seq coll)) (println "The collection" coll "is empty")))
;; or use empty? (less idiomatic)
(empty? '())
