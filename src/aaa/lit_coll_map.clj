;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Map - collection of key-value pairs stored in a Hash Array Mapped Tries (HAMT)
;;   PersistentHashMap have quasi-constant-time performance for lookup/insert/delete - O(log32)
;;   small maps are actually PersistentArrayMap
;;   _usually keys are keywords or strings_

;; checking the type on an empty map
(type {})
(type {:a 1, :b 2, :c 3, :d 4, :e 5, :f 6, :g 7, :h 8, :i 9})

;; a map with keywords as keys - notice: different types of values are okay; commas are optional
{:name "Alice", :age 30 :city, "New York"}

;; also keys could be of different type (don't do it)
{:name "Charlie", "age" 35, 1 "first-number"}

;; when useful, other types as keys are used
{1 "one", 2 "two", 3 "three"}

;; nested maps could be useful
{:user {:name "David", :age 28}, :settings {:theme "dark", :notifications true}}

;; no duplicated keys are allowed - won't compile
;; {:name "First", :age 25, :name "Second"}

;;
;; access a value
;; by invoking get on the map and the key
(get {:a 1, :b 2} :a)
;; idiomatic: use the map as a function
({:a 1, :b 2} :a)
;; most idiomatic: use a keyword as a function
(:a {:a 1, :b 2})
