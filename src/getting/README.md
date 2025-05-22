# clj-intro - Introduction to Clojure
Tested on Java 21, Clojure 1.12

# Getting Clojure
Russ Olsen (2018) The Pragmatic Programmer

https://pragprog.com/titles/roclojure/getting-clojure/

## Part 1 - Basics

### Chapter 1 - Hello, Clojure
#### a. The Very Basics
- [Hello!](p1/ch1/a/e1.clj): print (and comments)
- [Concatenate](p1/ch1/a/e2.clj): str
- [Size](p1/ch1/a/e3.clj): count
- [Constants](p1/ch1/a/e4.clj): true, false, nil
#### b. Arithmetic
- [Basic operations](p1/ch1/b/e1.clj): + - * /
- [Combining operations](p1/ch1/b/e2.clj)
#### c. Not Variable Assignment, but Close
- [Binding symbol to value](p1/ch1/c/e1.clj): def
#### d. A Function of Your Own
- [Binding symbol to function](p1/ch1/d/e1.clj): defn
#### e. In the Wild
- [Uber jar](p1/ch1/e/e1.clj): ns, :gen-class, -main, deps.edn, build.clj 
- [Uber jar /2](p1/ch1/e/e2.clj): -main calling another function
- [define and redefine](p1/ch1/e/e3.clj): multiple def and defn on the same symbol

### Chapter 2 - Vectors and Lists
#### a. One Thing After Another
- [vector](p1/ch2/a/e1.clj): literal syntax []
#### b. A Toolkit of Functions
- [vector](p1/ch2/b/e1.clj): function
- [basics operations on vector](p1/ch2/b/e2.clj): count, first, rest, nth
#### c. Growing Your Vectors
- [vector conjunction and construct](p1/ch2/c/e1.clj): conj, cons
#### d. Lists
- [list](p1/ch2/d/e1.clj): literal syntax '(), list function
- [basics operations on list](p1/ch2/d/e2.clj): count, first, rest, nth
#### e. Lists versus Vectors
- [list conjunction and construct](p1/ch2/e/e1.clj): conj, cons

### Chapter 3 - Maps, Keywords, and Sets
#### a. This Goes with That
- [create a map](p1/ch3/a/e1.clj): literal syntax {}, hash-map function
- [get value from map by key](p1/ch3/a/e1.clj): get
#### b. Keywords
- [keyword as map key](p1/ch3/b/e1.clj)
#### c. Changing Your Map Without Changing It
- [add/modify an entry to a map](p1/ch3/c/e1.clj): assoc
- [remove an entry to a map](p1/ch3/c/e2.clj): dissoc
- [add/modify an item to a vector](p1/ch3/c/e3.clj): assoc on vector
#### d. Other Handy Map Functions
- [getting all the keys in a map](p1/ch3/d/e1.clj): keys
- [getting all the values in a map](p1/ch3/d/e2.clj): vals
- [sorted map](p1/ch3/d/e3.clj): sorted-map
#### e. Sets
- [create a set](p1/ch3/e/e1.clj): literal syntax #{}, hash-set function
- [search in a set](p1/ch3/e/e2.clj): contains?, by key
- [add/remove an item](p1/ch3/e/e3.clj): conj, disj

### Chapter 4 - Logic
#### a. The Fundamental If
- [executing a form only if a condition is truthy](p1/ch4/a/e1.clj): if
- [choosing which form execute between two ones](p1/ch4/a/e2.clj): if (else)
- [generating a value accordingly to condition](p1/ch4/a/e3.clj)
- [no "else" implies nil](p1/ch4/a/e4.clj)
#### b. Asking Questions
- [equality testing](p1/ch4/b/e1.clj): =, not=
- [predicates to compare numbers](p1/ch4/b/e2.clj): > >= < <=
- [some other predicates](p1/ch4/b/e3.clj): number? string? keyword? map? vector?
- [boolean functions](p1/ch4/b/e4.clj): not and or
#### c. Truthy and Falsy
- [Kind of true, kind of false](p1/ch4/c/e1.clj)
#### d. Do and When
- [grouping forms](p1/ch4/d/e1.clj): do
- [grouping forms in a condition](p1/ch4/d/e2.clj): if-do[-do]
- [grouping forms, only for truthy](p1/ch4/d/e3.clj): when
#### e. Dealing with Multiple Conditions
- [if "else if" "else" is a pain](p1/ch4/e/e1.clj)
- [simplify by cond](p1/ch4/e/e2.clj): cond predicate value
- [the cond :else idiom](p1/ch4/e/e3.clj): cond :else
- [simplified condition](p1/ch4/e/e4.clj): case
#### f. Throwing and Catching
- [Clojure exception](p1/ch4/f/e1.clj): ex-info ExceptionInfo

### Chapter 5 - More Capable Functions
#### a. One Function, Different Parameters
- [multi-arity function](p1/ch5/a/e1.clj)
- [multi-arity function revised](p1/ch5/a/e2.clj): filling in the defaults
#### b. Arguments with Wild Abandon
- [variadic function with rest parameter](p1/ch5/b/e1.clj): & marker
- [accessing an item from a rest parameter](p1/ch5/b/e2.clj)
- [mixing plain and rest parameters](p1/ch5/b/e3.clj)
#### c. Multimethods
- [function behavior based on argument structure](p1/ch5/c/e1.clj): if - "else if" approach
- [simplified approach](p1/ch5/c/e2.clj): defmulti, defmethod
- [dispatch function example](p1/ch5/c/e3.clj)
- [no dispatch function example](p1/ch5/c/e4.clj): dispatch by keyword
#### d. Deeply Recursive
- [plain recursive function (no TCO)](p1/ch5/d/e1.clj)
- [tail call optimization on recursion](p1/ch5/d/e2.clj): recur
- [idiomatic TCO on recursion](p1/ch5/d/e3.clj): loop recur
- [standard functions often make life easier](p1/ch5/d/e4.clj): (apply/map spoiler)
#### e. Docstrings
- [documenting defn, def (and more)](p1/ch5/e/e1.clj)
#### f. Pre- and Post-Conditions
- [precondition the hard way](p1/ch5/f/e1.clj): when-not
- [precondition](p1/ch5/f/e2.clj): {:pre [expressions]}
- [postcondition](p1/ch5/f/e3.clj): {:post [expressions]}
#### g. Staying Out of Trouble
- [variadic in multi-arity](p1/ch5/g/e1.clj)

### Chapter 6 - Functional Things
#### a. Functions Are Values
- [a combiner as higher order function](p1/ch6/a/e1.clj)
#### b. Functions on the Fly
- [anonymous function](p1/ch6/b/e1.clj): fn
- [a closure](p1/ch6/b/e2.clj)
- [another closure](p1/ch6/b/e3.clj)
#### c. A Functional Toolkit
- [call a function on the items of a collection](p1/ch6/c/e1.clj): apply
- [build a function with fewer parameters](p1/ch6/c/e2.clj): partial
- [another example for partial](p1/ch6/c/e3.clj)
- [build a negating function](p1/ch6/c/e4.clj): complement
- [combine predicates and-ing them together](p1/ch6/c/e5.clj): every-pred
#### d. Function Literals
- [minimalistic syntax for anonymous function](p1/ch6/d/e1.clj): #()

### Chapter 7 - Let
#### a. A Local, Temporary Place for Your Stuff
- [local binding](p1/ch7/a/e1.clj): let
#### b. Let Over Fn
- [make the previous example more complex](p1/ch7/b/e1.clj)
- [function factory keeps the complexity under control](p1/ch7/b/e2.clj): let fn
#### c. Variations on the Theme
- [combining if and let together](p1/ch7/c/e1.clj): if-let
- [combining when and let together](p1/ch7/c/e2.clj): when-let
#### d. Staying Out of Trouble
- [let lexical scope](p1/ch7/d/e1.clj)
- [nested let](p1/ch7/d/e2.clj)
- [duplicated let](p1/ch7/d/e3.clj)

### Chapter 8 - Def, Symbols, and Vars
#### a. A Global, Stable Place for Your Stuff
- [globally bind a symbol to a value](p1/ch8/a/e1.clj): def, defn
#### b. Symbols Are Things
- [What is a symbol](p1/ch8/b/e1.clj)
#### c. Bindings Are Things Too
- [What is a var](p1/ch8/c/e1.clj)
#### d. Varying Your Vars
- [vars could vary (but shouldn't)](p1/ch8/d/e1.clj)
- [use dynamic vars (spoiler), only when strictly required](p1/ch8/d/e2.clj): ^:dynamic binding \*earmuff\*
#### e. In the Wild
- [some commonly used standard earmuffs](p1/ch8/e/e1.clj): \*print-length\* \*1 \*e

### Chapter 9 - Namespaces
#### a. A Place for Your Vars
- [create/switch namespace](p1/ch9/a/e1.clj): ns
#### b. Loading Namespaces
- [accessing vars from namespace not already known](p1/ch9/b/e1.clj): require
#### c. A Namespace of Your Own
- [a minimal Clojure app](p1/ch9/c/e1.clj): ns :gen-class
- [each file with its own namespace](p1/ch9/c/e2.clj)
- [requiring while defining a namespace](p1/ch9/c/e3.clj): ns :require
#### d. As and Refer
- [aliasing a required namespace](p1/ch9/d/e1.clj): ns :require :as
- [pulling a var in the current namespace](p1/ch9/d/e2.clj): ns :require :refer
#### e. Namespaces, Symbols, and Keywords
- [getting the current namespace](p1/ch9/e/e1.clj): \*ns\*
- [getting a namespace by name, and its vars](p1/ch9/e/e2.clj): find-ns, ns-map
- [extracting the namespace from symbols and keywords](p1/ch9/e/e3.clj): namespace

## Part 2 - Intermediate

### Chapter 10 - Sequences
Each standard collection is implemented in terms of a sequence, supporting all the methods defined in ISeq.
#### a. One Thing After Another
- [adapting vector to sequence](p2/ch10/a/e1.clj): seq
- [list is-a sequence](p2/ch10/a/e2.clj)
- [adapting map to sequence](p2/ch10/a/e3.clj)
- [empty seq is nil](p2/ch10/a/e3.clj)
#### b. A Universal Interface
- [first element](p2/ch10/b/e1.clj): first
- [the elements beyond the first](p2/ch10/b/e2.clj): rest
- [alternative to rest](p2/ch10/b/e3.clj): next
- [add an element in first position](p2/ch10/b/e4.clj): cons
- [an alternative count function](p2/ch10/b/e5.clj)
#### c. A Rich Toolkit …
- [sorting a seqable](p2/ch10/c/e1.clj): sort
- [reversing](p2/ch10/c/e2.clj): reverse
- [splitting in subseq's by their size](p2/ch10/c/e3.clj): partition, partition-all
- [merging in a seq](p2/ch10/c/e4.clj): interleave, interpose
#### d. … Made Richer with Functional Values
- [keeping elements respecting a predicate](p2/ch10/d/e1.clj): filter
- [get the first truthy value returned by predicate](p2/ch10/d/e2.clj): some
#### e. Map (function)
- [map the elements maintaining the element types](p2/ch10/e/e1.clj): map
- [extract a field from a map (structure)](p2/ch10/e/e2.clj): map
- [extract and transform](p2/ch10/e/e3.clj): map comp, for
#### f. Reduce
- [combine the seq elements into a result](p2/ch10/f/e1.clj): reduce
- [get one single value from a collection](p2/ch10/f/e2.clj)
#### g. Composing a Solution
- [an example of function composition](p2/ch10/g/e1.clj): sort-by, reverse, take, map, interpose, apply str

### Chapter 11 - Lazy Sequences
#### a. Sequences Without End
- [lazily generate an infinite seq](p2/ch11/a/e1.clj): repeat
#### b. More Interesting Laziness
- [lazy infinite repetition of a seq](p2/ch11/b/e1.clj): cycle
- [lazy infinite seq generated by a function](p2/ch11/b/e2.clj): iterate
#### c. Lazy Friends
- [lazy finite subseq from an infinite lazy seq](p2/ch11/c/e1.clj): take
- [lazy map an infinite lazy seq](p2/ch11/c/e2.clj): map
- [lazy interleave infinite lazy seqs](p2/ch11/c/e3.clj): interleave
#### d. Laziness in Practice
- [a lazy example](p2/ch11/d/e1.clj)
#### e. Behind the Scenes
- [building a lazy seq](p2/ch11/e/e1.clj): lazy-seq
- [implementing a simple version of repeat](p2/ch11/e/e2.clj)
- [implementing a simple version of iterate](p2/ch11/e/e3.clj)
- [implementing a simple version of map](p2/ch11/e/e4.clj)
#### f. Staying Out of Trouble
- [(kind of) printing an infinite seq](p2/ch11/f/e1.clj): set! *print-length*
- [getting a file as a string](p2/ch11/f/e2.clj): slurp doall doseq

### Chapter 12. Destructuring
#### a. Pry Open Your Data
- [destructure a collection](p2/ch12/a/e1.clj): the [] destructuring pattern
#### b. Getting Less than Everything
- [discarding elements from destructuring_](p2/ch12/b/e1.clj): the idiomatic dummy symbol _
- [multilevel destructuring](p2/ch12/b/e2.clj): [[]]
#### c. Destructuring in Sequence
- [any seqable could be destructured: a list](p2/ch12/c/e1.clj)
- [string is seqable, it could be destructured](p2/ch12/c/e2.clj)
#### d. Destructuring Function Arguments
- [destructuring a parameter](p2/ch12/d/e1.clj)
#### e. Digging into Maps
- [map destructuring](p2/ch12/e/e1.clj): [{}]
#### f. Diving into Nested Maps
- [multilevel map destructuring](p2/ch12/f/e1.clj): [{{}}]
#### g. The Final Frontier: Mixing and Matching
- [destructuring map with vector](p2/ch12/g/e1.clj): [{[]}]
- [destructuring vector with map](p2/ch12/g/e2.clj): [{[]}]
#### h. Going Further
- [simplify destructuring a map](p2/ch12/h/e1.clj): the keyword :keys
- [keeping the destructured value as a whole](p2/ch12/h/e2.clj): by :as

### Chapter 13 - Records and Protocols
#### b. Striking a More Specific Bargain with Records
- [record: map with predefined key](p2/ch13/b/e1.clj): defrecord, ->RecordName, map->RecordName
#### c. Records Are Maps
- [record works just like a map](p2/ch13/c/e1.clj)
#### d. The Record Advantage
- [using record or map?](p2/ch13/d/e1.clj)
#### e. Protocols
- [define a protocol and implementing it in a record](p2/ch13/e/e1.clj): defprotocol
#### f. Decentralized Polymorphism
- [retrofit a type with a given protocol](p2/ch13/f/e1.clj): extend-protocol

### Chapter 14 - Tests
#### a. Spotting Bugs with clojure.test
- [defining a couple of functions](p2/ch14/a/e1.clj)
- [testing functions](../../test/getting/p2/ch14/a/e1_test.clj): clojure.test, deftest, is, testing
