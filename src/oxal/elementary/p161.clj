;; Problem 161, Subset and Superset
;; https://4clojure.oxal.org/#/problem/161
;; (clojure.set/superset? __ #{2})
;; (clojure.set/subset? #{1} __)
;; (clojure.set/superset? __ #{1 2})
;; (clojure.set/subset? #{1 2} __)

;; my solution
(def solution #{1 2})

(print "Is the problem solved? ")
(and (clojure.set/superset? solution #{2})
     (clojure.set/subset? #{1} solution)
     (clojure.set/superset? solution #{1 2})
     (clojure.set/subset? #{1 2} solution))