;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; String

;; It's the Java String
(type "Hello")

;; However, a string is a Seqable
(seqable? "Hello?")
;; meaning, it can be seen as a seq
(seq "Hello")
;; Specifically, a StringSeq
(type (seq "Hello"))
;; So, for instance, we can call the function first() on a string
(first "Hello")

;;
;; In clojure.core are defined a few fundamental string functions:

;; str - for concatenation / conversion
(str 1 2 3)

;; count - actually, works on any collection
(count "Hello")

;; subs - wraps String substring to make its use more natural in Clojure
(subs "Hello" 2 4)

;; format - wraps String format
(format "Hello, %s! You are %d years old." "Tom", 42)

;;
;; See the clojure.string namespace for many commonly used string functions
(require '[clojure.string :as str])

(str/upper-case "Hello")
(str/lower-case "Hello")
