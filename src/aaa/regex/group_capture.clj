;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Regular expression pattern literal

;; Capturing groups: capture the matching text, produce a vector (full match, group1 ... groupN)
(let [pattern #"(world)"]
  ;; full match: "world", group1: "world"
  (re-find pattern "hello world"))

(let [pattern #"(hello) (world)"]
  ;; full match: "hello world", group1: "hello", group2: "world"
  (re-find pattern "hello world"))

(let [pattern #"(hello) (world)"]
  ;; no match - nil
  (re-find pattern "hello Tom"))

;; Optional capturing groups - with quantifiers

(let [pattern #"(ha)+"]
  ;; full match: "hahaha", group1: "ha"
  (re-find pattern "hahaha!"))

(let [pattern #"(ha)*!"]
  ;; full match: "!", group1: nil
  (re-find pattern "ohohoh!"))

(let [pattern #"(\d+)?-(\d+)"]
  ;; full match: "-42", group1: nil, group2: 42
  (re-find pattern "-42"))
