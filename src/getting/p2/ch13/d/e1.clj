;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; record vs map

;; a record
(defrecord FictionalCharacter [name appears-in author])

;; two record instances
(def watson (->FictionalCharacter "John Watson" "Sign of the Four" "Doyle"))
(def irene {:name "Irene Adler" :appears-in "A Scandal in Bohemia" :author "Doyle"})

;; access to watson is (slightly) faster than to irene
(println (:name watson) "and" (:name irene))

;; using record makes the code clearer
(defrecord SuperComputer [cpu no-cpus storage-gb])
(def watson-2 (->SuperComputer "Power7" 2880 4000))

;; the two watson's are instances of different classes
(class watson)
(class watson-2)

(instance? FictionalCharacter watson)
(instance? SuperComputer watson-2)

;; DO NOT write code like this!
(defn process-thing [x]
  (if (instance? FictionalCharacter x)
    (println (:name x) "is a fictional character")
    (println x "could be a computer")))

(process-thing watson)
(process-thing watson-2)
(process-thing "Tom")
