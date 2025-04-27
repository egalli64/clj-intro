;;; For more info read Living Clojure by Carin Meier
;; Polymorphism: defprotocol and extend-protocol

;; a protocol is kind of an interface
(defprotocol BigMushroom
  ;; each class conforming to this protocol would define the function defined in it
  ;; the function is meant to operate on an instance of the associated class ("this" refers to it)
  (eat-mushroom [this]))

;; kind of retrofitting types with the specified protocol
(extend-protocol BigMushroom
  ;; the class "retrofitted"
  java.lang.String
  ;; how an instance of the class behaves
  (eat-mushroom [this] (str (.toUpperCase this) " mmmm tasty!"))

  clojure.lang.Keyword
  (eat-mushroom [this] (case this :grow "Eat the right side!", :shrink "Eat the left side!", "I don't understand"))

  java.lang.Long
  (eat-mushroom [this] (if (< this 3) "Eat the right side to grow" "Eat the left side to shrink")))

;; invoking a protocol function on an object instance of a class extended with that protocol
(println (eat-mushroom "Big Mushroom"))

;; test the multimethods
(let [values ["Big Mushroom" :grow :shrink :hello 0 10]]
  (doseq [value values]
    (println (eat-mushroom value))))
