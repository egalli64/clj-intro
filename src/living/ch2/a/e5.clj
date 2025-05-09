;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Logic tests on collections: not-any?, some

;; not-any? is the opposite of every?
(println "is not-any odd?" (not-any? odd? [2 4 6]))   ; true, they are all even!
(println "is not-any even?" (not-any? even? [1 3 6])) ; false, 6 is even

;; _some_ returns true if there is at least an element true against the passed predicate, or nil
(println "is there some element greater than 3?" (some #(> % 3) [1 2 3 4 5]))
(println "is there some element greater than 3?" (some #(> % 3) [1 2 3 2 1]))

;; _some_ can be used to check for more elements, by a set
(println "is there a 2 or 5 element?" (some #{2 5} [1 2 3 4 5]))
(println "is there a 0 or 6 element?" (some #{0 6} [1 2 3 4 5]))
;; but doesn't work on falsey values
(println "is there a nil or false element? (BAD!)" (some #{nil false} [1 2 nil 4 false]))
(println "is there a false element? (BAD!)" (some #{false} [1 2 3 4 false]))
