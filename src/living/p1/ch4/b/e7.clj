;;; For more info read Living Clojure by Carin Meier
;; Polymorphism: deftype (minimal automatic features)

;; a protocol with two functions
(defprotocol Edible (bite-right-side [this]) (bite-left-side [this]))

;; a type that implements a protocol
(deftype RegularMushroom [color height]
  Edible
  (bite-right-side [_] (str "The " color " bite tastes bad"))
  (bite-left-side [_] (str "The " color " bite tastes bad too")))

(let [mushroom (RegularMushroom. "brown" "1 inches")]
  (println "An instance of a record:" mushroom)
  (println "The class of the record instance is" (class mushroom))

  ;; accessing the field directly (preferred)
  (println "The mushroom color (dot-dash prefix):" (.-color mushroom))
  ;; accessing the field by getter
  (println "The mushroom color (dot prefix):" (.color mushroom))

  (println (bite-right-side mushroom))
  (println (bite-left-side mushroom)))
