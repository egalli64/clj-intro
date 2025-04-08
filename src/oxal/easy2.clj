;; Problem 28, Flatten a Sequence
;; https://4clojure.oxal.org/#/problem/28
;; Special Restrictions: flatten
;; (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
;; (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
;; (= (__ '((((:a))))) '(:a))
flatten

;; Problem 29, Get the Caps
;; https://4clojure.oxal.org/#/problem/29
;; (= (__ "HeLlO, WoRlD!") "HLOWRD")
;; (empty? (__ "nothing"))
;; (= (__ "$#A(*&987Zf") "AZ")
#(apply str (filter Character/isUpperCase %)) ; not supported by JS
#( clojure.string/replace % #"[^A-Z]" "" )

;; Problem 30, Compress a Sequence
;; https://4clojure.oxal.org/#/problem/30
;; (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
;; (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
;; (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
#(map first (partition-by identity %))
