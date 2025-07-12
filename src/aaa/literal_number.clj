;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Numbers: integer, bigint, rational, floating point, bigdec

;;
;; integers are Java long objects
(type 42)
(println Long/MAX_VALUE)

;; or, if bigger that Long/MAX_VALUE, BigInt - a wrapper around Java BigInteger
(type 9223372036854775808)

;; to force a "small" integer to be stored in a BigInt, use the suffix N
(type 42N)
;; or convert it explicitly to BigIng by calling the bigint constructor function
(type (bigint 42))
(type (bigint "42"))

;;
;; rationals are Ratio objects - managed as fraction
(type 1/3)
(println 1/3)

;;
;; floating points are Java Double objects
(type 3.14)

;; could be forced to BigDecimal by literal representation, suffix M
(type 3.14M)
;; or using the bigdec constructor function
(type (bigdec 3.14))
