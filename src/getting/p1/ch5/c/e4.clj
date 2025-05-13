;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; no dispatch function required in this example

(ns getting.p1.ch5.c.e4)

(defmulti book-description :genre)
(defmethod book-description :romance [book]
  (str (:title book) ": The heart warming new romance by " (:author book)))
(defmethod book-description :zombie [book]
  (str (:title book) ": The heart consuming new zombie adventure by " (:author book)))
;; new defmethod's could be added in a second time
(defmethod book-description :zombie-romance [book]
  (str (:title book) ": The heart warming and consuming new romance by " (:author book)))

(defn -main []
  (println (book-description {:title "Pride and Prejudice" :author "Austen" :genre :romance}))
  (println (book-description {:title "World War Z" :author "Brooks" :genre :zombie}))
  (println (book-description {:title "Pride and Prejudice and Zombies" :author "Grahame-Smith" :genre :zombie-romance})))
