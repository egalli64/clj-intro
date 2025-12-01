;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (map function collection)

;; generate a lazy seq applying a function to each item in the collection
(map #(+ % 1) [1 2 3 4])                                    ; (2 3 4 5)

(require '[clojure.string :as str])
(map str/capitalize ["bob" "tom"])               ; ("Bob" "Tom")

;; map more collections
(map + [1 2 3] [4 5 6])                                     ; (5 7 9)
(map + [1 2 3] [4 5])                                       ; (5 7)
;; using vector zip the passed vectors in the result
(map vector [:a :b :c] [1 2 3])                             ; ([:a 1] [:b 2] [:c 3])
