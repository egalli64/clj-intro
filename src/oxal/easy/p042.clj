;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Easy 4ever-clojure exercises
;; Problem 42, Factorial Fun
;; Calculate the factorial of the passed value
;; https://4clojure.oxal.org/#/problem/42
;; (= (__ 1) 1)
;; (= (__ 3) 6)
;; (= (__ 5) 120)
;; (= (__ 8) 40320)

;; thinking ...
(let [factorial
      (fn [n]
        ;; to get TCO, use loop recur
        (loop [n n, acc 1]
          ;; base case, if n is 1 (or less) return 1
          (if (<= n 1)
            acc
            ;; otherwise recur, accumulating by multiplication the current value
            (recur (dec n) (* acc n)))))
      ]
  ;; smoke test
  (println (factorial 8)))

;; solution
(let [__ #(loop [n %, acc 1] (if (<= n 1) acc (recur (dec n) (* acc n))))]
  (and (= (__ 1) 1)
       (= (__ 3) 6)
       (= (__ 5) 120)
       (= (__ 8) 40320)))
