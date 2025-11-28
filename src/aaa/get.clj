;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (get coll key)
;; (get coll key default)

;;
;; on a vector
;; it returns the associated value, if the index is in bound ...
(get [10 20 30] 1)

;; ... or nil ...
(get [10 20 30] 3)

;; ... or the provided default value
(get [10 20 30] 3 42)

;;
;; on a string
;; it returns the associated character, if the index is in bound ...
(get "get" 1)

;; ... or nil ...
(get "get" 3)

;; ... or the provided default value
(get "get" 3 42)

;;
;; on a map
;; it returns the associated value, if the key is present ...
(get {:a 1 :b 2} :a)

;; ... or nil ...
(get {:a 1 :b 2} :c)

;; ... or the provided default value
(get {:a 1 :b 2} :c 42)

;;
;; on a set
;; it returns the value, if it is present ...
(get #{:a :b} :a)

;; ... or nil ...
(get #{:a :b} :c)

;; ... or the provided default value
(get #{:a :b} :c 42)

;;
;; on a non-ILookup instance it always returns nil (or the provided default)
(get '(1 2 3) 1)
(get 42 2 "surprise")
