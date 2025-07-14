;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Character - (Unicode)

;; Character are actually of type Java Character
(type \a)

;; a string is made of characters
(str \H \e \l \l \o)

;; a string is seqable to a seq of Characters - StringSeq
(seq "Hello")
;; seq functions on strings see it as a StringSeq
(nth "Hello" 1)

;; special characters
(str \A \space \B \newline \C \tab \D \return)

;; Unicode support
(str "Beta: " \u03b2)

;; use the function char to coerce an integer to character
(char 42)

;; use the Java Character class for predicates on characters
(Character/isDigit \5)
