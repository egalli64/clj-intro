;;; For more info read Living Clojure by Carin Meier
;; Namespace

;; in a script the namespace conventionally should match the filename
(ns living.p1.ch1.c.e3)

;; the dynamic var *ns* holds a reference to the current namespace
(println "*ns* now refers to" *ns*)

(def username "Tom")

(println "The var is put in the current namespace:" living.p1.ch1.c.e3/username)
(println "No need of explicit dereferencing:" username)

;; disable the clj-kondo warning on ns name
#_{:clj-kondo/ignore [:namespace-name-mismatch]}
(ns another)
(println "*ns* now refers to" *ns*)

(def username "Bob")
(println "No need of explicit dereferencing:" username)

;; require is not strictly required but makes things more clear
(require '[living.p1.ch1.c.e3])
;; accessing a symbol from another namespace
(println "Explicit use of namespace:" living.p1.ch1.c.e3/username)

;; switch namespace with require - preferred way
#_{:clj-kondo/ignore [:namespace-name-mismatch]}
(ns third
  (:require [living.p1.ch1.c.e3 :as main]))

;; access symbol by namespace alias
(println "Explicit use of namespace (by alias):" main/username)
