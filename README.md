# clj-intro
## Introduction to Clojure

Tested on Java 21, Clojure 1.12

Based on Clojure for the Brave and True
https://www.braveclojure.com/clojure-for-the-brave-and-true/

## Part 1 - Setup
    The user startup script
    e1. running a script
    e2. running an app
    e3. functions: +, *, first

## Part 2 - Language Fundamentals
### Chapter 3 - Crash Course
#### a. syntax
    e1. form, expression
    e2. control flow: if
    e3. control flow: if + do, when
    e4. nil, true, false
    e5. the equality operator =
    e6. or, and
    e7. def
#### b. data structures
    e1. numbers and strings
    e2. maps and keyword
    e3. vector
    e4. list
    e5. sets
#### c. functions
    e1. call
    e2. function, macro, special form
    e3. definition
    e4. arity overloading
    e5. variadic function
    e6. destructuring
    e7. anonymous function
    e8. closure
#### d. more
    e1. let
    e2. loop recur
    e3. regular expression
    e4. into
    e5. reduce

### Chapter 4 - Core Functions
#### a. programming to abstractions
    e1. sequence and seqable
    e2. map, first, rest, cons functions
    e3. from map (data structure) to seq
#### b. seq functions
    e1. more on using the map function
    e2. assoc
    e3. reduce for mapping
    e4. reduce for filtering
    e5. take, drop, take-while, drop-while
    e6. filter, some
    e7. sort, sort-by
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
    e1. apply
    e2. partial
    e3. complement

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
