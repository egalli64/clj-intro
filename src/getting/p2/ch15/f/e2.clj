;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; spec: fdef and spec test: instrument

(ns getting.p2.ch15.f.e2
  (:require [clojure.spec.alpha :as s]))

;; the spec repository, as already seen
(s/def ::title string?)
(s/def ::author string?)
(s/def ::copies int?)
(s/def ::book (s/keys :req-un [::title ::author ::copies]))
(s/def ::inventory (s/coll-of ::book))

;; the function that we want to keep under check
(defn find-by-title [title inventory]
  (some #(when (= (:title %) title) %) inventory))

;; put the check in the spec registry
(s/fdef find-by-title :args (s/cat :title ::title :inventory ::inventory))

;; how disappointing, no check enable!
(find-by-title "Emma" ["Emma" "2001" "Jaws"])

;; our function must be instrumented to be checked
(require '[clojure.spec.test.alpha :as st])
(st/instrument 'getting.p2.ch15.f.e2/find-by-title)

;; now it fails!
(find-by-title "Emma" ["Emma" "2001" "Jaws"])
