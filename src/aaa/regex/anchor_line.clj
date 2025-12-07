;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Regular expression pattern literal

;; Anchor: ^ $ - start/end of line
;; Multiline mode: (?m)

;; ^ the line must start as specified
(let [pattern #"^Hello"]
  (println (re-find pattern "Hello, Tom!"))
  (println (re-find pattern "Hey! Hello, Tom!")))

;; $ the line must end as specified
(let [pattern #"Tom!$"]
  (println (re-find pattern "Hello, Tom!"))
  (println (re-find pattern "Tom! Hello")))

;; multiline: each line is checked
(let [pattern #"(?m)^Hello"]
  (println (re-find pattern "Hello, Tom!"))
  (println (re-find pattern "Hey!\nHello, Tom!"))
  (println (re-find pattern "Hello, Bob!\nHello, Tom!")))
