;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Regular expression pattern literal

;; Non-capturing groups - just for structuring the pattern

(let [pattern #"(?:ha)+"]
  ;; "hahaha"
  (re-find pattern "hahaha!"))

(let [pattern #"(?:ha)*!"]
  ;; "!"
  (re-find pattern "ohohoh!"))

(let [pattern #"a(?:b|c)d"]
  ;; "abd"
  (re-find pattern "abd"))

