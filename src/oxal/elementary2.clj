;; Problem 11, conj on maps
;; https://4clojure.oxal.org/#/problem/11
;; (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))
{:b 2}

;; Problem 12, Sequences
;; https://4clojure.oxal.org/#/problem/12
;; (= __ (first '(3 2 1)))
;; (= __ (second [2 3 4]))
;; (= __ (last (list 1 2 3)))
3

;; Problem 13, rest
;; https://4clojure.oxal.org/#/problem/13
;; (= __ (rest [10 20 30 40]))
[20 30 40]

;; Problem 14, Functions
;; https://4clojure.oxal.org/#/problem/14
;; (= __ ((fn add-five [x] (+ x 5)) 3))
;; (= __ ((fn [x] (+ x 5)) 3))
;; (= __ (#(+ % 5) 3))
;; (= __ ((partial + 5) 3))
8

;; Problem 15, Double Down
;; https://4clojure.oxal.org/#/problem/15
;; (= (__ 2) 4)
;; (= (__ 3) 6)
;; (= (__ 11) 22)
;; (= (__ 7) 14)
#(* % 2)

;; Problem 16, Hello World
;; https://4clojure.oxal.org/#/problem/16
;; (= (__ "Dave") "Hello, Dave!")
;; (= (__ "Jenn") "Hello, Jenn!")
;; (= (__ "Rhea") "Hello, Rhea!")
#(str "Hello, " % "!")

;; Problem 17, map
;; https://4clojure.oxal.org/#/problem/17
;; (= __ (map #(+ % 5) '(1 2 3)))
[6 7 8]

;; Problem 18, filter
;; https://4clojure.oxal.org/#/problem/18
;; (= __ (filter #(> % 5) '(3 4 5 6 7)))
[6 7]
