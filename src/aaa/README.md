# clj-intro
## Introduction to Clojure

Tested on Java 21, Clojure 1.12

## Some commonly used Clojure functions 
- [count](count.clj) - number of items
- [cons](cons.clj) - construct a seq 
- [conj](conj.clj) - conjunct items to a collection
- [map](map.clj) - transform items in a collection
- [filter](filter.clj) - select items matching a predicate
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
- [take]
- [take-while]
- [take-last]
- [drop]
- [drop-while]
- [drop-last]
- [remove]
- [keep]
- [filter-kv]
- [empty?] - Tests if a collection is empty
- [seq] - Returns a seq of the collection, or nil if empty
- [bounded-count] - Counts up to a limit without realizing the entire sequence

### Boolean connectors and related functions
- [and] - returns the first falsy value or the last value if all are truthy
- [or] - returns the first truthy value or the last falsy value
- [not] - returns true if the argument is falsy, false otherwise

- [some] - returns the first truthy result when applying a predicate to a collection
- [every?] - returns true if a predicate is true for all items in a collection
- [some?] - returns true if the argument is not nil
- [nil?] - returns true if the argument is nil
