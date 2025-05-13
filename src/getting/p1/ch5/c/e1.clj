;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; no defmulti, using if

(ns getting.p1.ch5.c.e1)

;; normalize the passed book to the {:title ? :author ?} format where input could be in the format:
;; {:title "War and Peace" :author "Tolstoy"}
;; {:book "Emma" :by "Austen"}
;; ["1984" "Orwell"]
(defn normalize-book [book]
  (if (vector? book)
    {:title (first book) :author (second book)}
    (if (contains? book :title)
      book
      {:title (:book book) :author (:by book)})))

(defn -main []
  (println (normalize-book {:title "War and Peace" :author "Tolstoy"}))
  (println (normalize-book {:book "Emma" :by "Austen"}))
  (println (normalize-book ["1984" "Orwell"])))
