;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; composing sort-by, reverse, take, map, interpose, apply str in a function

;; given these books
(def books
  [{:title "Deep Six" :price 13.99 :genre :sci-fi :rating 6}
   {:title "Dracula" :price 1.99 :genre :horror :rating 7}
   {:title "Emma" :price 7.99 :genre :comedy :rating 9}
   {:title "2001" :price 10.50 :genre :sci-fi :rating 5}])

;; we want the three top-rated books in a string: "Emma // Dracula // Deep Six"

;; 1) sort by rating
(sort-by :rating books)

;; 2) reverse the ordering
(reverse (sort-by :rating books))

;; 3) take only the first three books
(take 3 (reverse (sort-by :rating books)))

;; 4) we are interested just in the titles
(map :title (take 3 (reverse (sort-by :rating books))))

;; 5) merge them in a seq, interposing the separator "//"
(interpose " // " (map :title (take 3 (reverse (sort-by :rating books)))))

;; 6) concatenate the elements to get a single string
(apply str (interpose " // " (map :title (take 3 (reverse (sort-by :rating books))))))

;; 7) wrap it in a function
(defn format-top-titles [books]
  (apply str (interpose " // " (map :title (take 3 (reverse (sort-by :rating books)))))))

;; ... and finally call the function on the collection
(format-top-titles books)
