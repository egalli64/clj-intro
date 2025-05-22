;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; extend-protocol

;; an existing hierarchy based on the protocol Person
(defprotocol Person
  (full-name [this])
  (greeting [this msg])
  (description [this]))

(defrecord FictionalCharacter [name appears-in author]
  Person
  (full-name [this] (:name this))
  (greeting [this msg] (str msg " " (:name this)))
  (description [this] (str (:name this) " is a character in " (:appears-in this))))

(defrecord Employee [first-name last-name department]
  Person
  (full-name [_] (str first-name " " last-name))
  (greeting [_ msg] (str msg ", " first-name))
  (description [_] (str first-name " works in " department)))

;; an unrelated record type
(defrecord SuperComputer [cpu no-cpus storage-gb])

;; we want to retrofit the tree record type above to support this new protocol
(defprotocol Marketable
  (make-slogan [this]))

;; no need to change the actual record definition!
(extend-protocol Marketable
  ;; each record is extended to support the Marketable method
  Employee
  (make-slogan [x] (str (:first-name x) " is the BEST employee!"))
  FictionalCharacter
  (make-slogan [x] (str (:name x) " is the GREATEST character!"))
  SuperComputer
  (make-slogan [x] (str "This computer has " (:no-cpus x) " CPUs!"))
  ;; even non-record could be retrofitted to support the protocol
  String
  (make-slogan [x] (str \" x \" " is a string! WOW!"))
  Boolean
  (make-slogan [x] (str x " is one of the two surviving Booleans!")))

(make-slogan (->Employee "Tom" "..." "..."))
(make-slogan (->FictionalCharacter "Bob" "..." "..."))
(make-slogan (->SuperComputer "..." 42 "..."))
(make-slogan "hello")
(make-slogan true)
