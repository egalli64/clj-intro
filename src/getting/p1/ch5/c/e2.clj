;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; defmulti, defmethod

(ns getting.p1.ch5.c.e2)

;; dispatch function, used by defmulti to choose the actual defmethod to invoke
(defn dispatch-book-format [book]
  (cond (vector? book) :vector-book
        (contains? book :title) :standard-map
        (contains? book :book) :alternative-map))

;; dispatch the call to the right defmethod accordingly to the result of dispatch-book-format
(defmulti normalize-book dispatch-book-format)

;; each normalize-book is identified by the keyword returned by the dispatch function
(defmethod normalize-book :vector-book [book] {:title (first book) :author (second book)})
(defmethod normalize-book :standard-map [book] book)
(defmethod normalize-book :alternative-map [book] {:title (:book book) :author (:by book)})

(defn -main []
  (println (normalize-book {:title "War and Peace" :author "Tolstoy"}))
  (println (normalize-book {:book "Emma" :by "Austen"}))
  (println (normalize-book ["1984" "Orwell"]))
  ;; a non-supported book format causes an exception
  ;; (println (normalize-book #{"1984" "Orwell"}))
  )
