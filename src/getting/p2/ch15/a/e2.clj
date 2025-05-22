;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; spec to alpha validation: valid?, and, or

(ns getting.p2.ch15.a.e2
  (:require [clojure.spec.alpha :as s]))

;; check if the passed value is a number
(s/valid? number? 44)
(s/valid? number? :hello)

;; spec and
(def n-gt-10 (s/and number? #(> % 10)))

(s/valid? n-gt-10 1)
(s/valid? n-gt-10 10)
(s/valid? n-gt-10 11)

;; spec and: a more complex helper
(def n-gt-10-lt-100 (s/and number? #(> % 10) #(< % 100)))

(s/valid? n-gt-10-lt-100 11)
(s/valid? n-gt-10-lt-100 100)

;; spec or
(def n-or-s (s/or :a-number number? :a-string string?))

(s/valid? n-or-s "Hello!")
(s/valid? n-or-s 99)
(s/valid? n-or-s 'foo)

;; combining spec
(def n-gt-10-or-s (s/or :greater-10 n-gt-10 :a-symbol symbol?))

(s/valid? n-gt-10-or-s 'foo)
(s/valid? n-gt-10-or-s 42)
(s/valid? n-gt-10-or-s 1)
