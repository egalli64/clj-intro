;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (filter predicate collection)

;; generate a lazy seq containing only the items accepted by the predicate
(filter even? (range 10))                                   ; (0 2 4 6 8)

(filter #(> (count %) 3) ["tom" "bob" "charlie" "john"])    ; ("charlie" "john")

;; being lazy, it works on infinite sequences too
(take 5 (filter odd? (range)))                              ; (1 3 5 7 9)

;; filter on map
(filter (fn [[_ v]] (> v 5)) {:a 5 :b 7 :c 3})              ; ([:b 7])
;; use into to preserve the map structure
(into {} (filter (fn [[_ v]] (> v 5)) {:a 5 :b 7 :c 3}))    ; {:b 7}
