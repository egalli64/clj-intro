;; Problem 29, Get the Caps
;; https://4clojure.oxal.org/#/problem/29
;; (= (__ "HeLlO, WoRlD!") "HLOWRD")
;; (empty? (__ "nothing"))
;; (= (__ "$#A(*&987Zf") "AZ")

;; thinking ...

;; by filter
(println "Filter the uppercase letters:" (filter Character/isUpperCase "HeLlO, WoRlD!"))
(print "Join a char seq in a str (apply to force the realization): ")
(println (apply str (filter Character/isUpperCase "HeLlO, WoRlD!")))

(defn caps-only [s] (apply str (filter Character/isUpperCase s)))
(println "Final result:" (caps-only "HeLlO, WoRlD!"))

;; by clojure.string/replace
(defn caps-only [s] (clojure.string/replace s #"[^A-Z]" ""))
(println "Strip non-uppercase:" (caps-only "HeLlO, WoRlD!"))

;; my solutions
; Java specific, not supported by JS
(def solution #(apply str (filter Character/isUpperCase %)))
(println "Filter by anon function:" (solution "HeLlO, WoRlD!"))

; pure Clojure solution
(def solution #(clojure.string/replace % #"[^A-Z]" "" ))

;; verify it
(print "Is the problem solved? ")
(empty? (solution "nothing"))
