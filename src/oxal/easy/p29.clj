;; Problem 29, Get the Caps
;; https://4clojure.oxal.org/#/problem/29
;; (= (__ "HeLlO, WoRlD!") "HLOWRD")
;; (empty? (__ "nothing"))
;; (= (__ "$#A(*&987Zf") "AZ") : #( clojure.string/replace % #"[^A-Z]" "" )
;; #(apply str (filter Character/isUpperCase %)) ; not supported by JS

;; elaborating on the theme

;; by filter
(println "Filter the uppercase letters:" (filter Character/isUpperCase "HeLlO, WoRlD!"))
(print "Join a char seq in a str (apply to force the realization): ")
(println (apply str (filter Character/isUpperCase "HeLlO, WoRlD!")))

(defn caps-only [s] (apply str (filter Character/isUpperCase s)))
(println "Final result:" (caps-only "HeLlO, WoRlD!"))

;; by clojure.string/replace
(defn caps-only [s] (clojure.string/replace s #"[^A-Z]" ""))
(println "Strip non-uppercase:" (caps-only "HeLlO, WoRlD!"))

;; #( clojure.string/replace % #"[^A-Z]" "" )

(print "Is the actual problem solved? ")
(empty? (#( clojure.string/replace % #"[^A-Z]" "" ) "nothing"))
