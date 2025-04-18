;;; For more info read Living Clojure by Carin Meier
;; Functions

;; defn

;; define a var for function
(defn string-generator [] "a defn function")

;; invoke a function
(println "Invoke ..." (string-generator))

;; a function with two parameters
(defn user-generator [name surname] {:name name, :surname surname})
(println "Invoke a function w/ arguments ..." (user-generator "Tom" "Hollz"))

;; fn

;; define and invoke immediately an anonymous function
(println "Define and invoke an anon function ..." ((fn [name surname] {:name name, :surname surname}) "Bob" "Smith"))

;; def on fn

(def fun-gen (fn [name surname] {:name name, :surname surname}))
(println "Invoke an anon function in a var ..." (fun-gen "Kim" "Bing"))

;; #() shorthand for anonymous functions

;; unfortunately #() and map literal don't go along well
(println "Immediately invoke another anon function:" (#(hash-map :name %1 :surname %2) "Jim" "Knee"))

(def fg #(hash-map :name %1 :surname %2))
(println "Invoke another anon function in a var ..." (fg "Joe" "Doll"))
