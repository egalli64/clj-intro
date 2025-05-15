;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; if-let

;; two books
(def anonymous-book {:title "Sir Gawain and the Green Knight"})
(def with-author {:title "Once and Future King" :author "White"})

;; let wrapping an if in it
(defn uppercase-author [book]
  (let [author (:author book)] (if author (.toUpperCase author) "ANONYMOUS")))

;; same, but in a more compact way
(defn uppercase-author [book]
  (if-let [author (:author book)] (.toUpperCase author) "ANONYMOUS"))

(uppercase-author anonymous-book)
(uppercase-author with-author)
