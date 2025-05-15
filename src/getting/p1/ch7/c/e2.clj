;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; when-let

;; two books
(def anonymous-book {:title "Sir Gawain and the Green Knight"})
(def with-author {:title "Once and Future King" :author "White"})

;; let wrapping an when in it
(defn uppercase-author [book]
  (let [author (:author book)] (when author (.toUpperCase author))))

;; same, but in a more compact way
(defn uppercase-author [book]
  (when-let [author (:author book)] (.toUpperCase author)))

(uppercase-author anonymous-book)
(uppercase-author with-author)
