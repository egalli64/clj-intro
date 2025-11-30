;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Literal real: Java Double, bigdec

;;
;; floating points are Java Double objects
(type 3.14)

;; could be forced to BigDecimal by literal representation, suffix M
(type 3.14M)
;; or using the bigdec constructor function
(type (bigdec 3.14))

;; 32-bit real numbers are not commonly used in Clojure
(type (float 3.14))

;; coerce a number to double
(type (double 42))
