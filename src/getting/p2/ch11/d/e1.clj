;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; a lazy seq example

;; we want to generate a mock seq like this:
(def test-books
  [{:author "Bob Jordan", :title "Wheel of Time, Book 1"}
   {:author "Jane Austen", :title "Wheel of Time, Book 2"}
   {:author "Chuck Dickens", :title "Wheel of Time, Book 3"}
   {:author "Leo Tolstoy", :title "Wheel of Time, Book 4"}
   {:author "Bob Poe", :title "Wheel of Time, Book 5"}
   {:author "Jane Jordan", :title "Wheel of Time, Book 6"}
   {:author "Chuck Austen", :title "Wheel of Time, Book 7"}])

;; since doing it by hand is boring, let's think to a better approach

;; a trilogy could be generated in this way:
(def trilogy (map #(str "Wheel of Time, Book " %) (range 1 4)))
(println trilogy)

;; it's easy to change it in an infinite series:
(def titles (map #(str "Wheel of Time, Book " %) (iterate inc 1)))

;; the eleventh instalment of the saga
(println (nth titles 10))

;; author names
(def first-names ["Bob" "Jane" "Chuck" "Leo"])
(def last-names ["Jordan" "Austen" "Dickens" "Tolstoy" "Poe"])

;; mapping names to an infinite seq of author names
(def authors (map #(str %1 " " %2) (cycle first-names) (cycle last-names)))

;; the author of the eleventh instalment of the saga
(println (nth authors 10))

;; the infinite saga
(def books (map (fn [a t] {:author a :title t}) authors titles))

;; the first ten instalments of the saga
(take 10 books)
