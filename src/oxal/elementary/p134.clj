;; Problem 134, A nil key
;; https://4clojure.oxal.org/#/problem/134
;; (true?  (__ :a {:a nil :b 2}))
;; (false? (__ :b {:a nil :b 2}))
;; (false? (__ :c {:a nil :b 2}))

;; thinking ...
;; the map should contain the required key
;; and the associated value should be nil
(println (and (contains? values :a) (nil? (values :a))))

;; my solution
(fn solution [key data] (and (contains? data key) (nil? (data key))))

(print "Is the problem solved? ")
(and (solution :a {:a nil :b 2}) (solution :b {:a nil :b 2}) (solution :c {:a nil :b 2}))
