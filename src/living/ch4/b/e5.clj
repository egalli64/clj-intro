;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Polymorphism: defrecord

;; define the Mushroom record, with two fields
(defrecord Mushroom [color height])
(println "A record actually is a (Java) class:" (class Mushroom))

;; each record has its associated ctor
(def regular-mushroom (Mushroom. "white and blue polka dots" "2 inches"))
(println "An instance of a record:" regular-mushroom)
(println "The class of the record instance is" (class regular-mushroom))

;; accessing the field directly (preferred)
(println "The mushroom color (dot-dash prefix):" (.-color regular-mushroom))
;; accessing the field by getter
(println "The mushroom color (dot prefix):" (.color regular-mushroom))
;; accessing the field relying to the map structure
(println "The mushroom color (colon prefix):" (:color regular-mushroom))
