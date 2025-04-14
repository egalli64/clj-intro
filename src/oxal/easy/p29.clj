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

(let [caps-only (fn [s] (apply str (filter Character/isUpperCase s)))]
  (println "Final result:" (caps-only "HeLlO, WoRlD!")))

;; by clojure.string/replace
(require '[clojure.string :as str])
(let [caps-only (fn [s] (str/replace s #"[^A-Z]" ""))]
  (println "Strip non-uppercase:" (caps-only "HeLlO, WoRlD!")))

;; solution /1: Java specific, not supported by JS
(let [solution #(apply str (filter Character/isUpperCase %))]
  (println "Filter by anon function:" (solution "HeLlO, WoRlD!")))

;; solution /2: pure Clojure
(def solution #(clojure.string/replace % #"[^A-Z]" ""))

;; verify it
(print "Is the problem solved? ")
(empty? (solution "nothing"))