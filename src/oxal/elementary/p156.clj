;; Problem 156, Map Defaults
;; https://4clojure.oxal.org/#/problem/156
;; (= (__ 0 [:a :b :c]) {:a 0 :b 0 :c 0})
;; (= (__ "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})
;; (= (__ [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})

;; thinking ...
;; zipmap is the simplest way to go
(zipmap [:a :b :c] (repeat 0))
;; map using an anon function
(into {} (map (fn [keys] [keys 0]) [:a :b :c]))
(into {} (map #(vector % 0) [:a :b :c]))

;; my solution
(defn solution [default keys] (zipmap keys (repeat default)))

(print "Is the problem solved? ")
(and (= (solution 0 [:a :b :c]) {:a 0 :b 0 :c 0})
     (= (solution "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})
     (= (solution [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]}))

