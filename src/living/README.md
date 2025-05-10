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
- [class, boolean, nil, true?, false?, nil?](ch2/a/e1.clj)
- [not, =, not =](ch2/a/e2.clj)
  #### Logic tests on collections
  - [empty?, seq](ch2/a/e3.clj)
  - [every?](ch2/a/e4.clj)
  - [not-any?, some](ch2/a/e5.clj)
  #### Flow control
  - [if, if-let](ch2/a/e6.clj)
  - [when, when-let](ch2/a/e7.clj)
  - [cond :else](ch2/a/e8.clj)
  - [case](ch2/a/e9.clj)
#### b. Functions Creating Functions and Other Neat Expressions
- [Currying with partial](ch2/b/e1.clj)
- [Composition with comp](ch2/b/e2.clj)
  #### Destructuring
  - [sequences](ch2/b/e3.clj)
  - [maps](ch2/b/e4.clj)
  - [parameters](ch2/b/e5.clj)
#### c. The Power of Laziness
- [range](ch2/c/e1.clj)
- [take from range, repeat, count](ch2/c/e2.clj)
- [repeatedly, cycle, rest on cycle](ch2/c/e3.clj)
#### d. Recursion
- [Traversing a seq by recursion](ch2/d/e1.clj)
- [loop - recur](ch2/d/e2.clj)
#### e. The Functional Shape of Data Transformations
  #### The map function
  - [basic use of map function](ch2/e/e1.clj)
  - [map and side effects - doall](ch2/e/e2.clj)
  - [zipping together collections with map](ch2/e/e3.clj)
  - [reduce](ch2/e/e4.clj)
  - [filter and remove - complement](ch2/e/e5.clj)
  - [the for expression - :let and :when modifiers](ch2/e/e6.clj)
  - [flatten](ch2/e/e7.clj)
  - [into](ch2/e/e8.clj)
  - [partition, partition-all, partition-by](ch2/e/e9.clj)

### Chapter 3 - State and Concurrency
#### a. Using Atoms for Independent Items (sync)
- [atom: def and deref](ch3/a/e1.clj)
- [reset!](ch3/a/e2.clj)
- [swap!](ch3/a/e3.clj) and dotimes
- [future](ch3/a/e4.clj) competing on an atom with swap!
#### b. Using Refs for Coordinated (sync) Changes - Software Transactional Memory (STM)
- [ref](ch3/b/e1.clj): def and deref
- [dosync and ref-set](ch3/b/e2.clj)
- [dosync and alter](ch3/b/e3.clj)
- [future](ch3/b/e4.clj) competing on refs by dosync/alter
- [commute](ch3/b/e5.clj)
- [future](ch3/b/e6.clj) competing on refs by dosync/commute
#### c. Using Agents to Manage Changes on Their Own (async, by queue)
- [agent](ch3/c/e1.clj): def and deref
- [send, send-off](ch3/b/e2.clj)
  #### Exceptions
  - [agent-error, restart-agent](ch3/c/e3.clj)
  - [set-error-mode!](ch3/c/e4.clj)
  - [set-error-handler!](ch3/c/e5.clj)

### Chapter 4 - Java Interop and Polymorphism
#### a. Handling Interop with Java
- [class](ch4/a/e1.clj) invoking an instance method, creating a new object
- [import, invoking a static method](ch4/a/e2.clj)
- [using the doto macro to chained calls](ch4/a/e3.clj)
#### b. Practical Polymorphism
- [using cond for type dispatching](ch4/b/e1.clj)
  #### Multimethod: defmulti and defmethod
  - [class as dispatch function](ch4/b/e2.clj)
  - [custom dispatch function](ch4/b/e3.clj)
  #### Protocol
  - [defprotocol and extend-protocol](ch4/b/e4.clj)
  - [custom data type (DTO-like)](ch4/b/e5.clj): defrecord
  - [defrecord and defprotocol](ch4/b/e6.clj)
  - [deftype](ch4/b/e7.clj)

### Chapter 5 - How to Use Clojure Projects and Libraries
#### _[But I'm using deps.edn, not Leiningen]_
- [creating a project](ch5/e1.clj) with deps.edn
- [creating a test](ch5/e2.clj): deftest, testing
- [dependency management](ch5/e3.clj) with deps.edn

### Chapter 6 - Communication with core.async
- [core.async](ch6/e1.clj): create a channel
#### a. Basics of core.async Channels
- [sync channel](ch6/a/e1.clj): put >!! and take <!!
- [close](ch6/a/e2.clj)
- [async channel](ch6/a/e3.clj): put >! and take <! in a go block
- [the go-loop block](ch6/a/e4.clj)
- [alts!](ch6/a/e5.clj)
- [Recap](ch6/a/e6.clj): Serving Tea at a core.async Tea Party
- [jar](ch6/a/e7.clj): Creating a Tea Party to Be Run from the Command Line

### Chapter 8 - The Power of Macros
    e1. Exploring Macros: macroexpand-1
    e2. no macro
    e3. defmacro
    e4. template: backtick ` and tilde ~
    e5. defmacro and template

### Chapter 10 - Weekly Living Clojure Training Plan
#### a. Week 1..3 [4clojure exercises](https://4clojure.oxal.org/)
See my solution in the [Oxal](../oxal/README.md) repo section
