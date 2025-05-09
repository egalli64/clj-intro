# clj-intro
## Introduction to Clojure

Tested on Java 21, Clojure 1.12

Notes jotted down while reading Living Clojure by Carin Meier (2015) O'Reilly
https://www.oreilly.com/library/view/living-clojure/9781491909270/

### Chapter 1 - The Structure of Clojure
#### a. Baby Steps with Simple Values
- [Numbers](ch1/a/e1.clj)
- [Other types](ch1/a/e2.clj)
#### b. Put Your Clojure Data in Collections
- [list](ch1/b/e1.clj): '(), first, rest, cons
- [vector](ch1/b/e2.clj): [], first, rest, nth, last 
- [collections](ch1/b/e3.clj): count, conj 
- [map](ch1/b/e4.clj): {}, get, keys, vals, assoc, dissoc 
- [set](ch1/b/e5.clj): #{}, union, difference, intersection, contains? conj, disj, factory function
#### c. Symbols and the Art of Binding
- [def, user namespace, let](ch1/c/e1.clj) 
- [defn, fn, shorthand form #()](ch1/c/e2.clj)
- [namespace](ch1/c/e3.clj)

### Chapter 2 - Flow and Functional Transformations
#### a. Controlling the Flow with Logic
    e1. class, boolean, nil, true?, false?, nil?
    e2. not, =, not =
    Logic tests on collections
        e3. empty?, seq
        e4. every?
        e5. not-any?, some
    Flow control
        e6. if, if-let
        e7. when, when-let
        e8. cond :else
        e9. case
#### b. Functions Creating Functions and Other Neat Expressions
    e1. Currying with partial
    e2. Composition with comp
    Destructuring
        e3. sequences
        e4. maps
        e5. parameters
#### c. The Power of Laziness
    e1. range
    e2. take from range, repeat, count
    e3. repeatedly, cycle, rest on cycle
#### d. Recursion
    e1. Traversing a seq by recursion
    e2. loop - recur
#### e. The Functional Shape of Data Transformations
    The map function
        e1. basic use of map function
        e2. map and side effects - doall
        e3. zipping together collections with map
    e4. reduce
    e5. filter and remove - complement
    e6. the for expression - :let and :when modifiers
    e7. flatten
    e8. into
    e9. partition, partition-all, partition-by

### Chapter 3 - State and Concurrency
#### a. Using Atoms for Independent Items (sync)
    e1. atom: def and deref
    e2. reset!
    e3. swap! - and dotimes
    e4. future - competing on an atom with swap!
#### b. Using Refs for Coordinated (sync) Changes - Software Transactional Memory (STM)
    e1. ref: def and deref
    e2. dosync and ref-set
    e3. dosync and alter
    e4. future - competing on refs by dosync/alter
    e5. commute
    e6. future - competing on refs by dosync/commute
#### c. Using Agents to Manage Changes on Their Own (async, by queue)
    e1. agent: def and deref
    e2. send, send-off
    Exceptions
        e3. agent-error, restart-agent
        e4. set-error-mode!
        e5. set-error-handler!

### Chapter 4 - Java Interop and Polymorphism
#### a. Handling Interop with Java
    e1. class, invoking an instance method, creating a new object
    e2. import, invoking a static method
    e3. using the doto macro to chained calls
#### b. Practical Polymorphism
    e1. using cond for type dispatching
    Multimethod: defmulti and defmethod
        e2. class as dispatch function
        e3. custom dispatch function
    Protocol
        e4. defprotocol and extend-protocol
        e5. custom data type (DTO-like): defrecord
        e6. defrecord and defprotocol
        e7. deftype

### Chapter 5 - How to Use Clojure Projects and Libraries
#### _[But I'm using deps.edn, not Leiningen]_
    e1. creating a project with deps.edn
    e2. creating a test: deftest, testing
    e3. dependency management with deps.edn

### Chapter 6 - Communication with core.async
    e1. using core.async, creating a channel
#### a. Basics of core.async Channels
    e1. sync channel put >!! and take <!!
    e2. close
    e3. async channel put >! and take <! in a go block
    e4. the go-loop block
    e5. alts!
    e6. Serving Tea at a core.async Tea Party (recap)
    e7. Creating a Tea Party to Be Run from the Command Line (jar)

### Chapter 8 - The Power of Macros
    e1. Exploring Macros: macroexpand-1
    e2. no macro
    e3. defmacro
    e4. template: backtick ` and tilde ~
    e5. defmacro and template

### Chapter 10 - Weekly Living Clojure Training Plan
#### a. Week 1..3 [4clojure exercises](https://4clojure.oxal.org/)
See my solution in the [Oxal](../oxal/README.md) repo section
