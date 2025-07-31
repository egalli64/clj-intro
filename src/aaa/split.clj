;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (split s re) - split a string on a regular expression in a vector of strings
;; (split s re n) - specify the max number of items returned

;; defined in the clojure.string namespace
(require '[clojure.string :as str])

;; split on a space
(= (str/split "a b c" #" ") ["a" "b" "c"])

;; split on spaces
(= (str/split "a  b\t\n c" #"\s+") ["a" "b" "c"])

;; split to single char strings
(= (str/split "abc" #"") ["a" "b" "c"])
