;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; map with comp, alternative approach by for

;; a collection
(def books
  [{:title "Deep Six" :price 13.99 :genre :sci-fi :rating 6}
   {:title "Dracula" :price 1.99 :genre :horror :rating 7}
   {:title "Emma" :price 7.99 :genre :comedy :rating 9}
   {:title "2001" :price 10.50 :genre :sci-fi :rating 5}])

;; map to get the length of each title
(map (fn [book] (count (:title book))) books)
;; simplified by anon literal notation
(map #(count (:title %)) books)

;; composing count and :title on each book
;; for each book, extract the title anc count its chars
(map (comp count :title) books)

;; same, using the for expression
;; for each book get the title, apply count on it, the results are sent to a seq
(for [b books] (count (:title b)))
