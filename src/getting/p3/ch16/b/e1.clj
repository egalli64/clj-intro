;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; :import

(ns getting.p3.ch16.b.e1
  (:import java.io.File))

(def authors (File. "authors.txt"))

(if (.exists authors)
  (println "Our authors file is there.") (println "Our authors file is missing."))

;; importing more classes from a package (CLI version)
(import '(java.io File InputStream))

;; the classes in java.lang do not need import
(type String)
