;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Regular expression pattern literal

;; Anchor: \b \B - word boundary
;; characters A-Z, a-z, 0-9, _ are considered "good" for a word

;; \b set a word boundary - match exact word
(let [pattern #"\bhello\b"]
  (println (re-find pattern "hello, Tom!"))
  (println (re-find pattern "My name is Bob Thellof")))

;; \B is the opposite of \b, not a word boundary - match inside word
(let [pattern #"\Bhello\B"]
  (println (re-find pattern "hello, Tom!"))
  (println (re-find pattern "My name is Bob Thellof")))
