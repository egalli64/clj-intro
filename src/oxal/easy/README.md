# clj-intro
## Introduction to Clojure

Tested on Java 21, Clojure 1.12

Easy 4ever-clojure exercises
https://4clojure.oxal.org/

Each file is a script. Run them in the REPL: (load-file "path/to/script.clj")

- [19](p019.clj) alternative last (by reduce) 
- [20](p020.clj) penultimate element (by butlast / drop-last)
- [21](p021.clj) alternative nth (by zero? first recur rest dec)
- [22](p022.clj) alternative count (by loop recur)
- [23](p023.clj) alternative reverse (by loop recur)
- [24](p024.clj) reduce on seq
- [25](p025.clj) filter on seq
- [26](p026.clj) compare defn with anon function (Fibonacci)
- [27](p027.clj) reverse on seq (Palindrome)
- [28](p028.clj) alternative flatten (by sequential mapcat)
- [29](p029.clj) string replace w/ regular expression, filter and Java isUpperCase w/ type hint
- [30](p030.clj) partition-by identity and map to remove duplicates
- [31](p031.clj) partition-by identity
- [32](p032.clj) repeat and mapcat on seq to duplicate the elements of a seq
- [33](p033.clj) repeat and mapcat on seq (variation)
- [34](p034.clj) alternative range (by loop-recur)
- [38](p038.clj) alternative max (by reduce)
- [39](p039.clj) alternative interleave (by apply concat on map result)
- [40](p040.clj) alternative interpose (by repeat, interleave, drop-last)
- [41](p041.clj) drop elements in nth position (by partition-all)
- [42](p042.clj) factorial (loop recur)
- [45](p045.clj) iterate
- [47](p047.clj) contains?
- [48](p048.clj) some
