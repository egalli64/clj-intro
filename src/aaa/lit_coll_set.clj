;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Set - immutable collection of unique, unordered elements

;; a PersistentHashSet - by literal syntax
(type #{1 2 3})

;; won't compile, duplicate key
;; #{1 2 3 1}

;; the constructor silently ignores duplicates
(hash-set 1 2 1 3)
;; coerce a collection to set
(set [1 2 3])

;; if ordered set is required, use sorted-set
(sorted-set 1 2 3)
(sorted-set-by > 1 2 3)

;; common operations
;; add
(conj #{1 2 3} 4 5 6)
;; remove
(disj #{1 2 3} 1 4)
;; check membership
(contains? #{1 2 3} 1)
(#{1 2 3} 1)
;; size
(count #{1 2 3})

;; set operations
(require '[clojure.set :as s])
(s/union #{1 2} #{2 3})
(s/intersection #{1 2 3} #{2 3 4})
(s/difference #{1 2 3 4} #{2 4})
(s/subset? #{1 2} #{1 2 3})
(s/superset? #{1 2 3} #{1 2})
