;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; Java static member access

(ns getting.p3.ch16.d.e1
  (:import java.io.File))

(println File/separator)

(def temp-authors-file (File/createTempFile "authors_list_" ".txt"))
(println temp-authors-file)
