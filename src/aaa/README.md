# clj-intro
# Introduction to Clojure

Tested on Java 21, Clojure 1.12

## Basic functions

### Definitions
- [def](def.clj) - bind symbol to value
- [fn](fn.clj) - create a function
- [defn](defn.clj) - combine def and fn
- [let](let.clj) - local binding and scope

### I/O and strings
- [println print](print-println.clj) - sending output to the console
- [str](str.clj) - generating a string (concatenating)

### Arithmetic
- [+, -, *, / and quot](arithmetic.clj) - basic operations
- [inc, dec] - increase, decrease a value by 1
- [max, min] - selecting a value

### Boolean connectors
- [and] - returns the first falsy value or the last value if all are truthy
- [or] - returns the first truthy value or the last falsy value
- [not] - returns true if the argument is falsy, false otherwise

### Comparison
- [=, not=, <, >, <=, >=]

## Essential functions

### Constructors
- [list] - singly linked list
- [vector] - indexed sequence (based on trie ADT)
- [hash-set] - hashtable (Hash Array Mapped Trie) backed set
- [hash-map] - HAMT-backed map
- [into](into.clj) - create a new collection with all items from the passed ones

### Transformers
- [map](map.clj) - transform items in a collection
- [filter](filter.clj) - elements satisfying a predicate
- [reduce](reduce.clj) - accumulate values from a collection

### Accessors
- [first] - the first element
- [rest] - all but the first element (or empty seq)
- [nth] - the element at index
- [get] - value by key/index

### Modifiers
- [cons](cons.clj) - construct: prepend to a seq
- [conj](conj.clj) - conjunct: add to collection in a natural way
- [assoc on map](assoc-map.clj) - upsert entry in a map
- [assoc on vector](assoc-vector.clj) - upsert item in a vector
- [dissoc on map] - remove keys from a map

### Inspectors
- [seq](seq.clj) - view a collection as a seq (nil if empty)
- [count](count.clj) - number of items
- [empty?](empty.clj) - is empty?

### Bit
- [bit-and bit-or bit-xor bit-not] - core operations
- [bit-shift-left bit-shift-right] - shifting
- [bit-test bit-set bit-clear bit-flip] - test and manipulation

## Commonly used functions

### Sequence combiners
- [concat](concat.clj) - join sequences
- [interleave]
- [partition]

### Transformers
- [mapcat]
- [keep] - non-nil results of applying a function to elements
- [take] - first n elements
- [drop] - all but first n elements

### Predicates
- [some] - the first truthy result of applying predicate to collection
- [every?] - is a predicate true for all items in a collection?
- [contains?] - does collection contain key/value?
- [some?] - is the argument not nil?
- [nil?] - is the argument nil?
- [zero?] - is number equals zero?
- [pos?] - is number positive?
- [neg?] - is number negative?
- [even?] - is number even?
- [odd?] - is number odd?
- [true?] - is argument true?
- [false?] - is argument false?

### Accessors
- [second] - the second element
- [last] - the last element
- [peek] - the first/last element (respecting the collection natural access pattern)
- [pop]

### Application functions
- [apply](apply.clj) - splat/spread/unpack a collection and apply a function to each item
- [partial] - Partial function application
- [comp] - Function composition

## Other useful functions

### Constructors
- [sorted-set] - BST backed set
- [sorted-set-by] - sorted set - with custom comparator
- [array-map] - map semantic on linear managed block of memory (if small "enough")
- [sorted-map] - BST backed map
- [sorted-map-by] - sorted map - with custom comparator
- [zipmap] - from two sequences (keys and values)

### Sequence reordering
- [sort] - sort collection in natural order
- [sort-by] - sort collection by applying function to elements
- [shuffle] - randomize the order of elements
- [reverse] - reverse the order of elements in a collection
- [rseq] - efficiently reverse vectors and sorted maps

### Application functions
- [juxt] - Apply multiple functions to same arguments
- [complement]

- [update] - Update values in a map
- [range] - Generate a sequence of numbers
- [repeat] - Create sequences with repeated values
- [repeatedly] - Create sequences with repeated values
- [iterate] - Generate an infinite sequence by repeatedly applying a function
- [->>] - Threading macros for clean data transformations
- [->] - Threading macros for clean data transformations
- [group-by] - Group collection elements by function result
- [frequencies] - Count occurrences in a collection
- [bounded-count] - Counts up to a limit without realizing the entire sequence

## Select elements from a collection
- [filter-kv] - filter for map
- [remove] - elements not satisfying a predicate
- [take-while] - take while predicate is true
- [take-last] - last n elements
- [drop-while] - drop while predicate is true
- [drop-last] - all but last n elements
- [butlast] - all but the last element
- [next] - all but the first element (or nil)
