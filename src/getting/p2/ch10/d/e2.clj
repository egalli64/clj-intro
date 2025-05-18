;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; some

;; the predicate neg? returns true for a negative value
(some neg? '(1 -22 3 -99 4 5 6 -77))

;; a collection
(def books
  [{:title "Deep Six" :price 13.99 :genre :sci-fi :rating 6}
   {:title "Dracula" :price 1.99 :genre :horror :rating 7}
   {:title "Emma" :price 7.99 :genre :comedy :rating 9}
   {:title "2001" :price 10.50 :genre :sci-fi :rating 5}])

;; a predicate that returns a book or nil
(defn cheap? [book] (when (< (:price book) 10) book))

;; a cheap books
(some cheap? books)

;; "some" returns a truthy value if exists an element respecting the predicate, so:
(if (some cheap? books)
  (println "We have cheap books for sale!"))
