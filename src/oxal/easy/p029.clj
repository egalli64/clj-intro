;; Problem 29, Get the Caps
;; https://4clojure.oxal.org/#/problem/29
;; (= (__ "HeLlO, WoRlD!") "HLOWRD")
;; (empty? (__ "nothing"))
;; (= (__ "$#A(*&987Zf") "AZ")

;; thinking ...

;; by filtering uppercase chars
;; I use the Java method Character/isUpperCase
;; to clarify which overload I want to invoke I use a type hint
(defn is-upper? [^char c] (Character/isUpperCase c))

(println "Filter the uppercase letters:" (filter is-upper? "HeLlO, WoRlD!"))
(print "Join a char seq in a str (apply to force the realization): ")
(println (apply str (filter is-upper? "HeLlO, WoRlD!")))

(let [caps-only (fn [s] (apply str (filter is-upper? s)))]
  (println "Final result:" (caps-only "HeLlO, WoRlD!")))

;; by clojure.string/replace
(require '[clojure.string :as str])
(let [caps-only (fn [s] (str/replace s #"[^A-Z]" ""))]
  (println "Strip non-uppercase:" (caps-only "HeLlO, WoRlD!")))

;; solution /1: Java specific, not supported by JS
(let [solution #(apply str (filter is-upper? %))]
  (println "Filter by anon function:" (solution "HeLlO, WoRlD!")))

;; solution /2: pure Clojure
(let [solution #(clojure.string/replace % #"[^A-Z]" "")]
  (print "Is the problem solved? ")
  (and (= (solution "HeLlO, WoRlD!") "HLOWRD")
       (empty? (solution "nothing"))
       (= (solution "$#A(*&987Zf") "AZ")))
