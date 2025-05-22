;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; map validation "by hand"

;; I'd like to check if this book is following my schema, but I have no schema
(def book {:title "Getting Clojure" :author "Olsen" :copies 1000000})

;; so I create a function to do that
(defn book? [x]
  (and
    ;; it should be a map
    (map? x)
    ;; it should contain the key :author referring to a string
    (string? (:author x))
    ;; it should contain the key :title referring to a string
    (string? (:title x))
    ;; it should contain the key :copies referring to a positive integer
    (pos-int? (:copies x))))

(book? book)
