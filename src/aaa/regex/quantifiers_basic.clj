;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Regular expression pattern
;; Quantifiers, applied to the preceding token

;; Basic quantifiers

;; Zero or more: *
(let [pattern #"x*"]
  (println "Find a 'one' match:" (re-find pattern "xa"))
  (println "Find a 'zero' match:" (re-find pattern "axxx"))
  (println "Find a 'more' match:" (re-find pattern "xxxa"))
  (println "Find a 'one' match:" (re-find pattern "xaxxx")))

;; One or more: +
(let [pattern #"x+"]
  (println "Find a 'one' match:" (re-find pattern "xa"))
  (println "Find a 'more' match:" (re-find pattern "axxx"))
  (println "Find a 'more' match:" (re-find pattern "xxxa"))
  (println "Find a 'one' match:" (re-find pattern "xaxxx")))

;; Zero or one: ?
(let [pattern #"x?"]
  (println "Find a 'one' match:" (re-find pattern "xa"))
  (println "Find a 'zero' match:" (re-find pattern "axxx"))
  (println "Find a 'one' match:" (re-find pattern "xxxa"))
  (println "Find a 'one' match:" (re-find pattern "xaxxx")))
