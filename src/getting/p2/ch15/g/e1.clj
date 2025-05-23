;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;;

(ns getting.p2.ch15.g.e1
  (:require [clojure.spec.alpha :as s]))

(s/def ::title string?)
(s/def ::author string?)
(s/def ::copies int?)
(s/def ::book (s/keys :req-un [::title ::author ::copies]))

(defn book-blurb [book]
  (str "The best selling book " (:title book) " by " (:author book)))

(book-blurb {:title "2001" :author "Clarke" :copies 21})

(require '[clojure.spec.test.alpha :as stest])
(stest/check 'getting.p2.ch15.g.e1/book-blurb)

(s/fdef book-blurb
        :args (s/cat :book ::book)
        :ret (s/and string? (partial re-find #"The best selling")))

(defn check-return [{:keys [args ret]}]
  (let [author (-> args :book :author)]
    (not (neg? (.indexOf ret author)))))

(s/fdef book-blurb
        :args (s/cat :book ::book)
        :ret (s/and string? (partial re-find #"The best selling"))
        :fn check-return)
