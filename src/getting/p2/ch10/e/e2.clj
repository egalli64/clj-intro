;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; map (book to title)

;; a collection
(def books
  [{:title "Deep Six" :price 13.99 :genre :sci-fi :rating 6}
   {:title "Dracula" :price 1.99 :genre :horror :rating 7}
   {:title "Emma" :price 7.99 :genre :comedy :rating 9}
   {:title "2001" :price 10.50 :genre :sci-fi :rating 5}])

;; the mapper gets a book returns its title
(map (fn [book] (:title book)) books)
;; in a more compact way
(map #(:title %) books)
;; or (since a keyword is a function in a map collection context)
(map :title books)
