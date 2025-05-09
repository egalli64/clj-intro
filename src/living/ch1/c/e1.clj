;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Symbols

;; define a var
;; a string object is put in the current namespace and associated to a symbol
(def developer "Alice")

;; the symbol makes the object accessible
(println "Using a var (in the current namespace):" developer)

;; local binding - here shadowing a global one (not a good idea)
(let [developer "Tom", rabbit "Bob"] (println "Using local bindings:" (str developer " and " rabbit)))

;; the global binding is not affected by the creation of a local one
(println "Using a var (in the user namespace):" user/developer)

;; Local binding are not accessible outside its definition scope
;; Syntax error: Unable to resolve symbol rabbit
;; (println rabbit)
