;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Regular expression pattern literal with escaped characters
;; Backslash is required for: . * + ? ^ $ \ | ( ) [ ] { }

# \. \*
(let [pattern #"a\.b\*"]
  (println (type pattern))
  (re-find pattern "a.b*"))

# \+ \?
(let [pattern #"a\+b\?"]
  (println (type pattern))
  (re-find pattern "a+b?"))

# \^ \$
(let [pattern #"a\^b\$"]
  (println (type pattern))
  (re-find pattern "a^b$"))

# \( \)
(let [pattern #"a\(b\)"]
  (println (type pattern))
  (re-find pattern "a(b)"))

# \[ \]
(let [pattern #"a\[b\]"]
  (println (type pattern))
  (re-find pattern "a[b]"))

# \{ \}
(let [pattern #"a\{b\}"]
  (println (type pattern))
  (re-find pattern "a{b}"))
