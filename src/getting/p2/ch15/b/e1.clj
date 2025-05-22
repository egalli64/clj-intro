;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; spec: coll-of, cat, keys

(ns getting.p2.ch15.b.e1
  (:require [clojure.spec.alpha :as s]))

(def coll-of-strings (s/coll-of string?))
(s/valid? coll-of-strings ["Alice" "In" "Wonderland"])

(def n-or-s (s/or :a-number number? :a-string string?))
(def coll-of-n-or-s (s/coll-of n-or-s))
(s/valid? coll-of-n-or-s ["Emma" 1815 "Jaws" 1974])

(def s-n-s-n (s/cat :s1 string? :n1 number? :s2 string? :n2 number?))
(s/valid? s-n-s-n ["Emma" 1815 "Jaws" 1974])

(def book-s
  (s/keys :req-un [:getting.p2.ch15.b.e1/title
                   :getting.p2.ch15.b.e1/author
                   :getting.p2.ch15.b.e1/copies]))

(s/valid? book-s {:title "Emma" :author "Austen" :copies 10})
(s/valid? book-s {:title "Arabian Nights" :copies 17})
(s/valid? book-s {:title "2001" :author "Clarke" :copies 1 :published 1968})

