;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Regular expression pattern literal

;; Anchor: \A \z \Z - start/end of input

;; \A means the input must start as specified
(let [pattern #"\AHello"]
  (println (re-find pattern "Hello, Tom!"))
  (println (re-find pattern "Hey! Hello, Tom!")))

;; multiline is ignored
(let [pattern #"(?m)\AHello"]
  (println (re-find pattern "Hello, Tom!"))
  (println (re-find pattern "Hey! Hello, Tom!"))
  (println (re-find pattern "Hello, Bob! Hello, Tom!")))

;; \z the input must end as specified (not even a \n is accepted after it)
(let [pattern #"Tom!\z"]
  (println (re-find pattern "Hello, Tom!"))
  (println (re-find pattern "Tom! Hello"))
  (println (re-find pattern "Hello, Tom!\n")))

;; \Z the input must end as specified (a single \n is accepted after it)
(let [pattern #"Tom!\Z"]
  (println (re-find pattern "Hello, Tom!"))
  (println (re-find pattern "Tom! Hello"))
  (println (re-find pattern "Hello, Tom!\n"))
  (println (re-find pattern "Hello, Tom!\n\n")))
