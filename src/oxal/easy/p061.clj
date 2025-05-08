;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Easy 4ever-clojure exercises
;; Problem 61, Map Construction
;; Create a map from a vector of keys and a vector of values
;; https://4clojure.oxal.org/#/problem/61
;; (= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})
;; (= (__ [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})
;; (= (__ [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})

;; thinking ...
;; we can't use zipmap, that is exactly what we need
(zipmap [:a :b :c] [1 2 3])

;; interleave is close to what we need, but generates a seq
(interleave [:a :b :c] [1 2 3])
;; we could partition the result of interleaving
(partition 2 [:a 1 :b 2 :c 3])
;; and put each pair in a map - notice: we need the pairs in vectors!
(into {} [[:a 1] [:b 2] [:c 3]] )

;; assoc on map simplify the job
(apply assoc {} (interleave [:a :b :c] [1 2 3]))

;; use map to generate pairs k/v and put them in a map by into
(into {} (map vector [:a :b :c] [1 2 3]))

;; solution
(let [__ #(into {} (map vector %1 %2))]
  (and (= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})
       (= (__ [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})
       (= (__ [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})))
