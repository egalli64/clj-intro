;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; testing

(ns getting.p2.ch14.a.e1)

(defn find-by-title
  "Search for a book by title,
  where title is a string and books is a collection
  of book maps, each of which must have a :title entry"
  [title books]
  (some #(when (= (:title %) title) %) books))

(defn number-of-copies-of
  "Return the number of copies in inventory of the
  given title, where title is a string and books is a collection
  of book maps each of which must have a :title entry"
  [title books]
  (:copies (find-by-title title books)))

;; smoke test
(defn -main []
  (let [books [{:title "2001" :author "Clarke" :copies 21}
               {:title "Emma" :author "Austen" :copies 10}
               {:title "Misery" :author "King" :copies 101}]]
    (println (find-by-title "2001" books))
    (println (number-of-copies-of "2001" books))))