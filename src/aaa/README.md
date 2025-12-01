# clj-intro

# Introduction to Clojure

Tested on Java 25, Clojure 1.12

## Form Categories

### 1. Literals - fixed values that evaluate to themselves

- Numbers
    - [Integer](literal_integer.clj) - integer, bigint, radix notation (2r<binary-digits>)
    - [Real numbers](literal_real.clj) - floating point, bigdec
    - [Rational](literal_rational.clj) - ratio
- [String](literal_string.clj) - (actually, a seqable) "hello"
- [Character](literal_character.clj) - \a \space
- [Keyword](literal_keyword.clj) - :name
- [Boolean](literal_boolean.clj) - true, false
- [Nil](literal_nil.clj) - nil

#### Collection literals (evaluates each element)

- [Vector](lit_coll_vector.clj) - [1 2 3]
- [Quoted list](lit_coll_list.clj) - '(1 2 3) must be quoted to be treated as a literal list
- [Map](lit_coll_map.clj) - {:a 1, :b 2, :c 3}
- [Set](lit_coll_set.clj) - #{:a :b :c}

### 2. Symbols - name referring to a value (resolution depends on context)

- [Global resolution](def.clj) - (def x 42)
- [Local resolution](let.clj) - (let [x 42] ...)

### 3. List forms - code to be evaluated, enclosed in parentheses

#### a. "Normal" forms - function call, ex: (+ 1 2)

- first element resolved as function, the other ones evaluated as arguments

#### b. Special forms - handled directly by the compiler, ex: (if condition 1 -1)

- [if, let, fn, do, ...] - fixed set defined by the language (see below)

### c. Macro forms - expanded before evaluation, first element resolves to a macro, returns a new form for evaluation

- Example (see below for more details): (when condition 1) is expanded to (if condition (do 1))

### 4. Reader-level elements (handled by the reader, not form)

- [; comment](comment.clj) - ignored by the reader
- [#_ 'discard' reader macro](discard.clj) - comment out the next form
- [' quote ` quasi-quote ~ unquote ~@ unquote-splice](reader_level_quote.clj) — quote and unquote forms
- [Regular expressions] - (#"pattern")
- [Anonymous functions] - ex: (#(+ %1 %2)) - see fn for comparison
- [Var references] - (#'my-var)

## Basic special forms

- [def](def.clj) - bind symbol to value
- [fn #()](fn.clj) - create a function (returns a function object)
- [let](let.clj) - local binding and scope
- [if](if.clj) - yield conditionally a value
- [quote](quote.clj) - yield the following form "as is", without evaluating it
- [do](do.clj) - evaluate expressions, yield the value of the last one

## Basic macros

- [defn](defn.clj) - combine def and fn
- [when] - combine if and do
- [cond](cond.clj) - multi-branch "if-else if" logic
- [-> ->>] - threading macros for clean data transformations

## Namespace Management

- [require] - load and link to other namespaces
- [use] - load and map public vars from another namespace (discouraged)
- [in-ns] - set the current namespace (often used in REPL)
- [the macro ns] - idiomatic way to declare a namespace at the top of a file

## Basic functions

### Console I/O

- [println print](print-println.clj) - send output to the console

### String

- [str](str.clj) - generate a string (by concatenation)
- [subs] - extract a substring by index range
- [format](format.clj) - generate a string (by formatting)

### Parse a string

- [parse-long parse-double parse-boolean parse-uuid] - Safe, return nil on failure

#### Coerce numeric values between types

- [int long float double bigint bigdec] - Unsafe, could throw an exception

### Arithmetic

- [+ - * / quot](arithmetic.clj) - basic operations
- [inc dec] - increase, decrease a value by 1
- [max min] - selecting a value
- [rem mod] - remainder and modulo
- [abs] - absolute value
- [Math/*] - Java Math interop (sqrt, pow, abs, sin, cos, log, ...)

### Boolean connectors

- [and] - returns the first falsy value or the last value if all are truthy (macro)
- [or] - returns the first truthy value or the last falsy value (macro)
- [not] - returns true if the argument is falsy, false otherwise

### Comparison

- [= == not= < > <= >=]

## Essential functions

### Constructors for collections

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
- [get](get.clj) - retrieve value by index (on vector and string) / by key (on map and set)

### Modifiers

- [cons](cons.clj) - construct: prepend to a seq
- [conj](conj.clj) - conjunct: add to collection in a natural way
- [assoc on vector](assoc-vector.clj) - upsert item in a vector

### Inspectors

- [seq](seq.clj) - view a collection as a seq (nil if empty)
- [count](count.clj) - number of items
- [empty?](empty.clj) - is empty?
- [not-empty] - is a collection not empty?

### Map-related functions

- [assoc](assoc-map.clj) - upsert entry in a map
- [dissoc] – remove one or more keys
- [contains?] – check if key is present
- [find] - retrieve map entry by key, or nil
- [keys] – get the seq of all keys
- [vals] – get the seq of all values
- [merge] – combine maps (later entries overwrite earlier ones)
- [select-keys] – filter by a seq of keys
- [update] – transform a value at a key
- [reduce-kv] - reduce a map by applying function to accumulator, key, and value

### The clojure.set namespace

- [union intersection difference] - fundamental set operations
- [subset? superset?] - check relation between sets

### Regular expressions

- [re-find] - find the first occurrence of the pattern in the string
- [re-matches] - match the entire string against the pattern
- [re-seq] - find all the matches in a lazy seq
- [re-pattern] - compile a string in a pattern
- [re-matcher + re-groups] - low level matching

### The clojure.string namespace

- [trim] - remove whitespace from both ends (w/ regex)
- [split](split.clj) - split a string into substrings (w/ regex)
- [join] - join collection into a string
- [upper-case lower-case] - change case
- [includes?] - check for substring presence
- [replace] - replace substrings (w/ regex)

### Advanced Arithmetic

- [*' +'] - auto-promoting arithmetic (overflow-safe)
- [rand rand-int] - random numbers
- [ratio? rational? integer? decimal?] - numeric type checking
- [numerator denominator] - for working with ratios
- [rationalize] - converts floating-point number to a ratio

### Bitwise Operations

- [bit-and bit-or bit-xor bit-not] - core operations
- [bit-shift-left bit-shift-right] - shifting
- [bit-test bit-set bit-clear bit-flip] - test and manipulation

## Commonly used functions

### Sequence Transformation & Combination

- [concat](concat.clj) - join sequences
- [flatten](flatten.clj) - recursively flatten nested sequences into a single sequence
- [interleave] - interleave elements from multiple sequences
- [partition partition-all] - break sequence into parts
- [mapcat] - map a function and concatenate results
- [keep] - non-nil results of applying a function to elements
- [map-indexed] - apply function to index and element (f index element)
- [keep-indexed] - apply function to index and element, returning non-nil/false results
- [take] - first n elements
- [drop] - all but first n elements

### Predicates

- [some] - the first truthy result of applying predicate to collection
- [every?] - is a predicate true for all items in a collection?
- [contains?] - check if an item is in a set (or the index is valid in a vector)
- [coll?] - is a collection?
- [nil?] - is the argument nil?
- [zero?] - is number equals zero?
- [pos?] - is number positive?
- [neg?] - is number negative?
- [even?] - is number even?
- [odd?] - is number odd?

### Accessors

- [second] - the second element
- [last] - the last element
- [peek] - the first/last element (respecting the collection natural access pattern)
- [pop]

### Application functions

- [apply](apply.clj) - splat/spread/unpack a collection and apply a function to each item
- [partial] - partial function application
- [comp] - function composition
- [identity] - return its argument unchanged

## More special forms

- [loop]
- [recur]
- [throw try]
- [binding] - establish dynamic variable bindings
- [set!] - mutate a Var's root binding (use with caution, generally discouraged for local state)

## More macros

- [for]
- [doseq]
- [case]
- [when-not]
- [dotimes] - loop a fixed number of times for side effects
- [doreduce] - loop efficiently with an accumulator (like a manual reduce)
- [comment] - ignore the forms that follow it (useful for temporary disabling code)
- [time] - evaluate an expression and prints the time it took

## Other useful functions

### Constructors

- [sorted-set] - BST backed set
- [sorted-set-by] - sorted set - with custom comparator
- [array-map] - map semantic on linear managed block of memory (if small "enough")
- [sorted-map] - BST backed map
- [sorted-map-by] - sorted map - with custom comparator
- [zipmap] - from two sequences (keys and values)
- [keyword] - return a keyword, interned for efficiency
- [symbol] - return a symbol, interned for efficiency

### Sequence reordering

- [sort] - sort collection in natural order
- [sort-by] - sort collection by applying function to elements
- [shuffle] - randomize the order of elements
- [reverse] - reverse the order of elements in a collection
- [rseq] - efficiently reverse vectors and sorted maps

### Application functions

- [juxt] - apply multiple functions to same arguments
- [complement] - transform a function to return its logical opposite
- [update] - apply a function to transform values in a vector (or a map)
- [constantly] - create a function that ignores its arguments and always returns the same value

### Sequence generation

- [range] - generate a sequence of numbers
- [repeat] - create sequences with repeated values
- [repeatedly] - create sequences with repeated values
- [iterate] - generate an infinite sequence by repeatedly applying a function

### Aggregation & Grouping

- [group-by] - group collection elements by function result
- [frequencies] - count occurrences in a collection
- [bounded-count] - counts up to a limit without realizing the entire sequence

### Select elements from a seqable

- [remove](remove.clj) - remove elements not satisfying a predicate
- [distinct] - remove duplicate elements while preserving order
- [dedupe] - remove consecutive duplicates only
- [filter-kv] - filter for map
- [take-while] - take while predicate is true
- [take-last] - last n elements (force traversal!)
- [drop-while] - drop while predicate is true
- [drop-last] - all but last n elements (force traversal!)
- [butlast] - all but the last element
- [next] - all but the first seq element (or nil)

### Concurrency & References

- [deref] - dereference an IRef (atom, ref, agent, promise) to get its current value
- [atom] - create an atomic reference for mutable state
- [swap!] - atomically update the value of an atom
- [reset!] - set the value of an atom
- [ref] - create a software transactional memory reference (for coordinated mutable state)
- [agent] - create an agent for asynchronous, isolated state changes
- [future] - create a future for asynchronous computation
- [promise] - create a promise for a value that will be delivered later
- [send] - send an action to an agent for isolated, asynchronous update

### Type inspection

- [type] - type of the object
- [class] - Java class of the object

### Value state predicates

- [some?] - is the argument not nil?
- [not-every?] - not all items satisfy the predicate
- [any? not-any?] - always true / no items satisfy the predicate
- [true?] - is argument true?
- [false?] - is argument false?

### Type/Implementation predicates

- [identical?] - check reference equality
- [realized?] - check if lazy sequence/delay is evaluated
- [bound?] - check if var has bound value
- [thread-bound?] - check if var is thread-locally bound

### REPL & Debugging Utilities

- [doc] - print the documentation string for a var
- [prn pr] - print to the console, with readably-printed output
