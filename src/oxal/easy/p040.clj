;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Easy 4ever-clojure exercises
;; Problem 40, Interpose a Seq
;; Write a function that interpose a value in a seq
;; https://4clojure.oxal.org/#/problem/40
;; (= (__ 0 [1 2 3]) [1 0 2 0 3])
;; (= (apply str (__ ", " ["one" "two" "three"])) "one, two, three")
;; (= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d])

;; thinking ...
(println (interpose :a [1 2 3]))                            ; (1 :a 2 :a 3)

;; but interpose is not an acceptable solution ...

;; match each value in the seq with the interposing value
;; use mapcat to map and flatten
(mapcat #(vector % :a) [1 2 3])

;; make an infinite seq from the interposing value
;; interleave the seq with the repetition
(interleave [1 2 3] (repeat :a))

;; get rid of the last element
(drop-last (interleave [1 2 3] (repeat :a)))                ; (1 :a 2 :a 3)

;; as function
(let [my-interpose (fn [x xs] (drop-last (interleave xs (repeat x))))]
  (println (my-interpose :a [1 2 3])))

;; solution
(let [__ #(drop-last (interleave %2 (repeat %1)))]
  (and (= (__ 0 [1 2 3]) [1 0 2 0 3])
       (= (apply str (__ ", " ["one" "two" "three"])) "one, two, three")
       (= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d])))
