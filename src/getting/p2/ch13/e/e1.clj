;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; protocol and record: defprotocol

;; a protocol is like a Java interface
;; declare methods that should be defined in record implementing it
;; "this" is the reference to the object on which the protocol should work
;; in this way a protocol is decoupled from types, allowing more flexibility
(defprotocol Person
  (full-name [this])
  (greeting [this msg])
  (description [this]))

;; define records that implement the Person protocol
;; "this" must be the first parameter
(defrecord FictionalCharacter [name appears-in author]
  Person
  (full-name [this] (:name this))
  (greeting [this msg] (str msg " " (:name this)))
  (description [this] (str (:name this) " is a character in " (:appears-in this))))

;; in the method we can directly access the records fields
;; so we can use _ instead of this in the parameter list
(defrecord Employee [first-name last-name department]
  Person
  (full-name [_] (str first-name " " last-name))
  (greeting [_ msg] (str msg ", " first-name))
  (description [_] (str first-name " works in " department)))

;; a couple of record instances
(def sofia (->Employee "Sofia" "Diego" "Finance"))
(def sam (->FictionalCharacter "Sam Weller" "The Pickwick Papers" "Dickens"))

;; polymorphic calls
(full-name sofia)
(description sam)
(greeting sofia "Hello")

;; accessing a specific record field - not seen by the protocol methods
(:author sam)
