;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; java.io.File

;; create a new object: class.
(def authors (java.io.File. "authors.txt"))

;; invoking methods: .method
(if (.exists authors)
  (println "Our authors file is there.") (println "Our authors file is missing."))

(if (.canRead authors)
  (println "We can read it!") (println "It can't be read"))

(.setReadable authors true)