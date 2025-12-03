;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Regular expression pattern
;; Quantifiers, applied to the preceding token

;; Interval quantifiers

;; Exactly n occurrences x{n}
(let [pattern #"x{3}"]
  (println "Find a match:" (re-find pattern "xxxa"))
  (println "Find a match:" (re-find pattern "xxxxa"))
  (println "Find a match:" (re-find pattern "axxx"))
  (println "Don't find a match:" (re-find pattern "xx")))

;; At least n occurrences x{n,}
(let [pattern #"x{3,}"]
  (println "Find a match:" (re-find pattern "xxxa"))
  (println "Find a match:" (re-find pattern "xxxxa"))
  (println "Find a match:" (re-find pattern "axxx"))
  (println "Don't find a match:" (re-find pattern "xx")))

;; From n to m occurrences x{n,m}
(let [pattern #"x{3,4}"]
  (println "Find a match:" (re-find pattern "xxxa"))
  (println "Find a match:" (re-find pattern "xxxxa"))
  (println "Find a match:" (re-find pattern "axxx"))
  (println "Don't find a match:" (re-find pattern "xx"))
  (println "Find a match:" (re-find pattern "xxxxx")))

;; * is the same as {0,}
(let [pattern #"x{0,}"]
  (println "Find a 'one' match:" (re-find pattern "xa"))
  (println "Find a 'zero' match:" (re-find pattern "axxx"))
  (println "Find a 'more' match:" (re-find pattern "xxxa"))
  (println "Find a 'one' match:" (re-find pattern "xaxxx")))

;; + is the same as {1,}
(let [pattern #"x{1,}"]
  (println "Find a 'one' match:" (re-find pattern "xa"))
  (println "Find a 'more' match:" (re-find pattern "axxx"))
  (println "Find a 'more' match:" (re-find pattern "xxxa"))
  (println "Find a 'one' match:" (re-find pattern "xaxxx")))

;; ? is the same as {0,1}
(let [pattern #"x{0,1}"]
  (println "Find a 'one' match:" (re-find pattern "xa"))
  (println "Find a 'zero' match:" (re-find pattern "axxx"))
  (println "Find a 'one' match:" (re-find pattern "xxxa"))
  (println "Find a 'one' match:" (re-find pattern "xaxxx")))
