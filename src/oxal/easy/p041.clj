;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Easy 4ever-clojure exercises
;; Problem 41, Drop Every Nth Item
;; Drop every Nth item from a sequence
;; https://4clojure.oxal.org/#/problem/41
;; (= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
;; (= (__ [:a :b :c :d :e :f] 2) [:a :c :e])
;; (= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])

;; thinking ...
(let [xs (range 10)]
  ;; partition in groups sized three (plus the terminal one)
  (println (partition-all 3 xs))
  ;; partition in groups sized two, starting from multiples of three (plus the terminal one)
  (println (partition-all 2 3 xs))

  ;; ... and concatenate all the sub seqs
  (println (apply concat (partition-all 2 3 xs)))
  )

;; as function
(let [dropper (fn [xs n] (apply concat (partition-all (dec n) n xs)))]
  (println (dropper (range 10) 3)))

;; solution
(let [__ #(apply concat (partition-all (dec %2) %2 %1))]
  (and (= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
       (= (__ [:a :b :c :d :e :f] 2) [:a :c :e])
       (= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])))
