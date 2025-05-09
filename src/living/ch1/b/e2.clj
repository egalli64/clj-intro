;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Collections: vector

;; Using Vectors for Collecting Data by Index

;; a number, a string, and a keyword in a vector (yuck!)
(println "A vector:" [42 "jam" :marmalade-jar])

(println "First is ..." (first [:a :b :c :d]))
(println "Rest is ..." (rest [:a :b :c :d]))
(println "Nth (index 2) is ..." (nth [:a :b :c :d] 2))
(println "Nth can be used on a list too (meh) ..." (nth '(:a :b :c :d) 2))
(println "Last is ..." (last [:a :b :c :d]))
(println "Last can be used on a list too (meh) ..." (last '(:a :b :c :d)))
(println "Using the vector function to create it ..." (vector :a :b :c :d))
