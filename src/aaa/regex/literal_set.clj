;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Regular expression pattern literal
;; Match one character from a set with square brackets: [abc]

;; Basic syntax (one char in the set)
(let [pattern #"[abc]"]
  (println (re-find pattern "xa"))
  (println (re-find pattern "bxc"))
  (println (re-find pattern "xyz")))

;; Use - for an interval (one char in the set identified by begin-end)
(let [pattern #"[a-z]"]
  (println (re-find pattern "Xa"))
  (println (re-find pattern "bXc"))
  (println (re-find pattern "XYZ")))
(let [pattern #"[0-9]"]
  (println (re-find pattern "X42"))
  (println (re-find pattern "2Y4"))
  (println (re-find pattern "XYZ")))

;; Use ^ to negate an interval (any char not in the set)
(let [pattern #"[^a-z]"]
  (println (re-find pattern "Xa"))
  (println (re-find pattern "bYc")))
(let [pattern #"[^0-9]"]
  (println (re-find pattern "X42"))
  (println (re-find pattern "2Y4"))
  (println (re-find pattern "XYZ")))
