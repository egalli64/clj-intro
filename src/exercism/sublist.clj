;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; Exercism Clojure Track https://exercism.org/tracks/clojure
;;
;; Sublist: https://exercism.org/tracks/clojure/exercises/sublist/
(ns exercism.sublist)

(defn classify
  "Returns:
  :equal if coll1 equals coll2,
  :superlist if coll1 is a superlist of coll2,
  :sublist if coll1 is a sublist of coll2,

  If none of these conditions is true, it returns :unequal."
  [coll1 coll2]
  (cond (= coll1 coll2) :equal
        (some #(= coll1 %) (partition (count coll1) 1 coll2)) :sublist
        (some #(= coll2 %) (partition (count coll2) 1 coll1)) :superlist
        :else :unequal))
