;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; not, =, not =

;; _not_ returns true if its argument is false in boolean context (falsey)
(println "not true is ..." (not true))          ; false
(println "not false is ..." (not false))        ; true
(println "not nil is ..." (not nil))            ; true! nil is falsey
(println "not 'whatever else' is ..." (not 0))  ; false! whatever else is truthy

;; = returns true if its arguments are equal - in the Java sense of equals()
(println "Compare :a with :a gives" (= :a :a))                ; true
(println "Compare many :a gives" (= :a :a :a :a))             ; true
(println "If at least one is different ..." (= :a :a :b :a))  ; false
(println "Compare :a with the char a gives" (= :a \a))        ; false
(println "Sequential collections (lists and vectors) are equal if their content is equal:" (= '(1 2 3) [1 2 3]))

;; not= is just a shortcut for (not (= ...))
(println "Are :a and :a different?" (not= :a :a))
(println "Are :a and :b different?" (not= :a :b))
