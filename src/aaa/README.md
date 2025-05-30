# clj-intro
## Introduction to Clojure

Tested on Java 21, Clojure 1.12

## Some commonly used Clojure functions 
- [count](count.clj) - number of items
- [cons](cons.clj) - construct a seq 
- [conj](conj.clj) - conjunct items to a collection
- [map](map.clj) - transform items in a collection
- [reduce](reduce.clj) - accumulate values from a collection
- [apply](apply.clj) - splat/spread/unpack a collection
- [assoc on map](assoc-map.clj) - upsert entry in a map
- [assoc on vector](assoc-vector.clj) - upsert item in a vector
- [dissoc on map] - remove keys from a map
- [update] - Update values in a map
- [concat] - Combine collections
- [range] - Generate a sequence of numbers
- [repeat] - Create sequences with repeated values
- [repeatedly] - Create sequences with repeated values
- [iterate] - Generate an infinite sequence by repeatedly applying a function
- [comp] - Function composition
- [partial] - Partial function application
- [juxt] - Apply multiple functions to same arguments
- [->>] - Threading macros for clean data transformations
- [->] - Threading macros for clean data transformations
- [group-by] - Group collection elements by function result
- [frequencies] - Count occurrences in a collection
- [seq] - Returns a seq of the collection, or nil if empty
- [bounded-count] - Counts up to a limit without realizing the entire sequence

### Core boolean connectors
- [and] - returns the first falsy value or the last value if all are truthy
- [or] - returns the first truthy value or the last falsy value
- [not] - returns true if the argument is falsy, false otherwise

### Predicates
- [some] - the first truthy result of applying predicate to collection
- [every?] - is a predicate true for all items in a collection?
- [some?] - is the argument not nil?
- [nil?] - is the argument nil?
- [zero?] - is number equals zero?
- [pos?] - is number positive?
- [neg?] - is number negative?
- [even?] - is number even?
- [odd?] - is number odd?
- [true?] - is argument true?
- [false?] - is argument false?
- [empty?] - is collection empty?
- [contains?] - does collection contain key/value?

### Access a collection element
- [nth] - the element at index
- [get] - value by key/index
- [first] - the first element
- [second] - the second element
- [last] - the last element
- [peek] - the first/last element (respecting the collection natural access pattern)

### Select elements from a collection
- [filter](filter.clj) - elements satisfying a predicate
- [filter-kv] - filter for map
- [remove] - elements not satisfying a predicate
- [take] - first n elements
- [take-while] - take while predicate is true
- [take-last] - last n elements
- [drop] - all but first n elements
- [drop-while] - drop while predicate is true
- [drop-last] - all but last n elements
- [butlast] - all but the last element
- [rest] - all but the first element (or empty seq)
- [next] - all but the first element (or nil)
- [keep] - non-nil results of applying a function to elements
