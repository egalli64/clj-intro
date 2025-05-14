;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; apply

;; + is a variadic function
(+ 1 2 3 4)

;; this is a ClassCastException
;; (+ [1 2 3 4])

;; the function apply is something like unpack/splat/spread in other languages
;; pass all the items of the collection to the applied function
(apply + [1 2 3 4])

;; str is a variadic function
(str "The number " 2 " best selling " "book.")

;; use apply to invoke str on each item of this vector
(def v ["The number " 2 " best selling " "book."])
(apply str v)

;; list is a variadic function
(list "The number " 2 " best selling " "book.")
(apply list v)

;; vector is a variadic function
;; (1) the vector is unpacked and each item is passed to list
;; (2) the list is unpacked and each item is passed to vector
(apply vector (apply list v))
