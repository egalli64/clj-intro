;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Literal integer (Java Long, BigInt)

;;
;; integers are Java Long objects
(type 42)
(println Long/MAX_VALUE)

;; or, if bigger that Long/MAX_VALUE, BigInt - a wrapper around Java BigInteger
(type 9223372036854775808)

;; use the suffix N to store a Java Long in a BigInt
(type 42N)
;; or coerce it explicitly to BigIng by calling the bigint constructor function
(type (bigint 42))
(type (bigint "42"))

;; coercing to Java Integer (beware of overflow!) and Long
(type (int Math/PI))
(type (long Math/PI))
;; (int Long/MAX_VALUE)

;;
;; Radix notation: 2r<binary-digits>, with radix in [2 .. 36]
(type 2r0)
(println 2r101010)
(println 36r16)
;; Syntax Error, radix out of range
;; (println 37r16)
