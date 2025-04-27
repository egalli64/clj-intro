;;; For more info read Living Clojure by Carin Meier
;; Polymorphism: defrecord and defprotocol

;; a protocol with two functions
(defprotocol Edible (bite-right-side [this]) (bite-left-side [this]))

;; a record that implements a protocol
(defrecord WonderlandMushroom [color height]
  Edible
  (bite-right-side [_] (str "The " color " bite makes you grow bigger"))
  (bite-left-side [_] (str "The " color " bite makes you grow smaller")))

(defrecord RegularMushroom [color height]
  Edible
  (bite-right-side [_] (str "The " color " bite tastes bad"))
  (bite-left-side [_] (str "The " color " bite tastes bad too")))

(let [mushroom (WonderlandMushroom. "blue dots" "3 inches")]
  (println (bite-right-side mushroom))
  (println (bite-left-side mushroom)))

(let [mushroom (RegularMushroom. "brown" "1 inches")]
  (println (bite-right-side mushroom))
  (println (bite-left-side mushroom)))
