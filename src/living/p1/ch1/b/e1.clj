;;; For more info read Living Clojure by Carin Meier
;; Collections: list

;; Using a List Collection

;; a number, a string, and a keyword in a list (yuck!)
(println "A list:" '(42 "jam" :marmalade-jar))

;; commas are usually _not_ used as separators
(println "A list:" '(42, "jam", :marmalade-jar))

;; What Can We Do with Lists?

(println "First is ..." (first '(:a :b :c :d)))
(println "Rest is ..." (rest '(:a :b :c :d)))
(println "Second is first of rest ..." (first (rest '(:a :b :c :d))))
(println "First of nil (empty list) is nil ..." (first nil))
(println "Rest of nil (empty list) is the empty list ..." (rest nil))
(println "Use cons to construct a list (from nil) ..." (cons 42 nil))
(println "Use cons to construct a list (from an empty list) ..." (cons 42 '()))
(println "Use cons recursively ..." (cons :a (cons :b (cons :c (cons :d nil)))))
(println "Using the list function to create a list ..." (list :a :b :c :d))
