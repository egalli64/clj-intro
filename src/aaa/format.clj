;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (format "template" arg1 arg2 ...) - wrapper around Java String.format

;; %s string
(format "Hello, %s!" "Tom")

;; %S uppercase string
(format "Hello, %S!" "Tom")

;; %c character
(format "This is a letter: %c" \x)

;; %C uppercase character
(format "This is an uppercase letter: %C" \x)

;; %d decimal integer
(format "Solution is %d" 42)

;; %x hex integer
(format "Solution is %x" 42)

;; %o octal integer
(format "Solution is %o" 42)

;; %f, %e floating point
(format "Solution is %f" Math/PI)
(format "Solution is %.15f" Math/PI)
(format "Solution is %e" (Math/pow Math/PI Math/E))

;; throws an exception
(format "%f" 42)
