# clj-intro
## Introduction to Clojure

Tested on Java 21, Clojure 1.12

Based on Clojure for the Brave and True
https://www.braveclojure.com/clojure-for-the-brave-and-true/

## Part 1 - Setup
    The user startup script
    e1. running a script
    e2. running an app, the -main function
    e3. calling functions: +, *, first

## Part 2 - Language Fundamentals
### Chapter 3 - Crash Course
#### a. syntax
    e1. form, expression, literal, operation
    e2. control flow: if, truthy and falsey (nil and false)
    e3. control flow: if do, when (if do with no "else")
    e4. the nil? function, truthy and falsey
    e5. the equality operator =
    e6. the boolean expressions or, and
    e7. def: bind a value to a symbol in the global scope
#### b. data structures
    e1. numbers and strings
    e2. map and keyword; hash-map {}
    e3. vector []
    e4. list '()
    e5. set: hash-set #{}
#### c. functions
    e1. invoking a callable
    e2. callables: function, macro, special form
    e3. definition by defn
    e4. arity overloading
    e5. variadic function by & more
    e6. destructuring by [[ x & more]]
    e7. anonymous function by (fn [] ) and #( % ) macro
    e8. closure
#### d. more
    e1. let: bind a value to a symbol in the local scope
    e2. loop recur: simplified TCO mechanism
    e3. regular expression: re-pattern, re-matches, re-find, re-seq
    e4. into function: plain and with transducer
    e5. the reduce high order function

### Chapter 4 - Core Functions
#### a. programming to abstractions
    e1. sequence and seqable: seq? and seqable?
    e2. functions on seqable: map, first, rest, cons 
    e3. from map (data structure) to seq
#### b. seq functions
    e1. more on using the map function
    e2. assoc: kind of cons for maps (but could also modify it)
    e3. reduce/assoc for mapping
    e4. reduce/assoc for filtering
    e5. take, drop, take-while, drop-while
    e6. filter, some, some w/ and
    e7. sort, sort w/ comparator, sort-by
    e8. concat
#### c. lazy seq functions
    e1. range
    e2. repeat
    e3. repeatedly
    e4. custom lazy seq generation
#### d. collection functions
    e1. count
    e2. empty?
    e3. every?
    e4. into
    e5. conj
#### e. function functions
    e1. apply: splat a collection
    e2. partial: simplify currying
    e3. complement: negate a predicate function

### Chapter 5 - Functional Programming
#### a. pure function
    e1. referential transparency
    e2. no side effects
#### b. living with immutable data structures
    e1. recursion instead of loop
    e2. function composition instead of attribute mutation
#### c. more function functions
    e1. comp
    e2. memoize

### Chapter 6 - Organizing Your Project
    e1. current namespace
    e2. def, ns-interns, names collision
    e3. create-ns, ns-name, in-ns
    e4. require, refer, alias, use
