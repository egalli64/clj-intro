;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (apply function seq)

; Used on functions expecting varargs, not working on a seq
; (+ [1 2 3 4])                                               ; ClassCastException

;; splat/unpack/spread a sequence and pass each value to function
(apply + [1 2 3 4])                                         ; 10
(apply max [10 2 9 1])                                      ; 10
(apply str ["H" "e" "l" "l" "o"])                           ; "Hello"

;; to create a collection
(apply hash-map [:a 1 :b 2 :c 3])                           ; {:c 3, :b 2, :a 1}
