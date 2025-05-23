;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; spec to check pre-conditions

(ns getting.p2.ch15.f.e1
  (:require [clojure.spec.alpha :as s]))

(s/def ::title string?)
(s/def ::author string?)
(s/def ::copies int?)
(s/def ::book (s/keys :req-un [::title ::author ::copies]))

(s/def ::inventory
  (s/coll-of ::book))

(defn find-by-title [title inventory]
  {:pre [(s/valid? ::title title) (s/valid? ::inventory inventory)]}
  (some #(when (= (:title %) title) %) inventory))

(def books [{:title "2001" :author "Clarke" :copies 21}
            {:title "Emma" :author "Austen" :copies 10}
            {:title "Misery" :author "King" :copies 101}])

;; this is going to fail, the inventory is not in the right format
(find-by-title "Emma" ["Emma" "2001" "Jaws"])

;; this is fine
(println (find-by-title "2001" books))
