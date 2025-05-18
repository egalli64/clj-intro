;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; reduce to extract a single value from a collection

;; I want to get the book having the highest price
(def books
  [{:title "Deep Six" :price 13.99 :genre :sci-fi :rating 6}
   {:title "Dracula" :price 1.99 :genre :horror :rating 7}
   {:title "Emma" :price 7.99 :genre :comedy :rating 9}
   {:title "2001" :price 10.50 :genre :sci-fi :rating 5}])

;; I need a function that check if the passed book has a higher price of the passed one
;; it returns the current higher price
(defn hi-price [hi book] (let [cur (:price book)] (if (> cur hi) cur hi)))

;; reduce the collection using the reducer defined above
(reduce hi-price 0 books)
