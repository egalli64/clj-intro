;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; List - singly linked list, efficient only if working on head

;; a PersistentList - by literal syntax
(type '(1 2 3))

;; create a list by constructor function
(list 1 2 3)

;; common operations, O(1)
;; cons - construct a new list prepending an item
(cons 1 nil)
;; conj - conjoin to a seq an element, for a list behaves like cons
(conj nil 1)
;; first - get the first item in the list
(first '(1 2 3))
;; rest - get the other items in the list (discarding the first one)
(rest '(1 2 3))
