;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (assoc map key val)
;; upsert: update if key is present, insert otherwise

;; reset a value for the given key
(assoc {:a 1, :b 2, :c 3} :b 42)                            ; {:a 1, :b 42, :c 3}
;; insert a new entry if the key is missing
(assoc {:a 1, :b 2, :c 3} :d 42)                            ; {:a 1, :b 2, :c 3, :d 42}
;; update an entry, insert the other one
(assoc {:a 1, :b 2, :c 3} :b 42, :d 4)                      ; {:a 1, :b 42, :c 3, :d 4}
