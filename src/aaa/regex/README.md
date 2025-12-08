# clj-intro

# Introduction to Regular Expression in Clojure

Tested on Java 25, Clojure 1.12

## Pattern literal syntax

- [Basic syntax](literal_syntax.clj) - #"pattern"
- [Special characters](literal_escape.clj) - . * + ? ^ $ \ | ( ) [ ] { } are escaped by backslash \
- [Character class](literal_set.clj) - [...], negated [^...]

## Anchors

- [Start/end of line](anchor_line.clj) - Start ^, end $ - multiline mode (?m)
- [Start/end of input](anchor_input.clj) - Start \A, end \z \Z
- [Word boundary](anchor_word.clj) - \b, negated \B

## Quantifiers

- [Basic quantifiers](quantifiers_basic.clj) - Zero or more *, one or more +, zero or one ?
- [Interval quantifiers](quantifiers_interval.clj) - The interval is defined by brackets, like {n,m}

## Grouping

- [Capturing groups](group_capture.clj) - #"(...)"
- [Non-capturing groups](group_non_capture.clj) - #"(?:...)"
- [Alternation operator](alternation.clj) - #"...|..."
