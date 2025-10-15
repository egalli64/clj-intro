# clj-intro - Introduction to Clojure
Tested on Java 25, Clojure 1.12

# Getting Clojure
Russ Olsen (2018) The Pragmatic Programmer

https://pragprog.com/titles/roclojure/getting-clojure/

## Part 1 - Basics

### Chapter 1 - Hello, Clojure
#### a. The Very Basics
- [Hello!](ch1/a/e1.clj): print (and comments)
- [Concatenate](ch1/a/e2.clj): str
- [Size](ch1/a/e3.clj): count
- [Constants](ch1/a/e4.clj): true, false, nil
#### b. Arithmetic
- [Basic operations](ch1/b/e1.clj): + - * /
- [Combining operations](ch1/b/e2.clj)
#### c. Not Variable Assignment, but Close
- [Binding symbol to value](ch1/c/e1.clj): def
#### d. A Function of Your Own
- [Binding symbol to function](ch1/d/e1.clj): defn
#### e. In the Wild
- [Uber jar](ch1/e/e1.clj): ns, :gen-class, -main, deps.edn, build.clj 
- [Uber jar /2](ch1/e/e2.clj): -main calling another function
- [define and redefine](ch1/e/e3.clj): multiple def and defn on the same symbol

### Chapter 2 - Vectors and Lists
#### a. One Thing After Another
- [vector](ch2/a/e1.clj): literal syntax []
#### b. A Toolkit of Functions
- [vector](ch2/b/e1.clj): function
- [basics operations on vector](ch2/b/e2.clj): count, first, rest, nth
#### c. Growing Your Vectors
- [vector conjunction and construct](ch2/c/e1.clj): conj, cons
#### d. Lists
- [list](ch2/d/e1.clj): literal syntax '(), list function
- [basics operations on list](ch2/d/e2.clj): count, first, rest, nth
#### e. Lists versus Vectors
- [list conjunction and construct](ch2/e/e1.clj): conj, cons

### Chapter 3 - Maps, Keywords, and Sets
#### a. This Goes with That
- [create a map](ch3/a/e1.clj): literal syntax {}, hash-map function
- [get value from map by key](ch3/a/e2.clj): get
#### b. Keywords
- [keyword as map key](ch3/b/e1.clj)
#### c. Changing Your Map Without Changing It
- [add/modify an entry to a map](ch3/c/e1.clj): assoc
- [remove an entry to a map](ch3/c/e2.clj): dissoc
- [add/modify an item to a vector](ch3/c/e3.clj): assoc on vector
#### d. Other Handy Map Functions
- [getting all the keys in a map](ch3/d/e1.clj): keys
- [getting all the values in a map](ch3/d/e2.clj): vals
- [sorted map](ch3/d/e3.clj): sorted-map
#### e. Sets
- [create a set](ch3/e/e1.clj): literal syntax #{}, hash-set function
- [search in a set](ch3/e/e2.clj): contains?, by key
- [add/remove an item](ch3/e/e3.clj): conj, disj

### Chapter 4 - Logic
#### a. The Fundamental If
- [executing a form only if a condition is truthy](ch4/a/e1.clj): if
- [choosing which form execute between two ones](ch4/a/e2.clj): if (else)
- [generating a value accordingly to condition](ch4/a/e3.clj)
- [no "else" implies nil](ch4/a/e4.clj)
#### b. Asking Questions
- [equality testing](ch4/b/e1.clj): =, not=
- [predicates to compare numbers](ch4/b/e2.clj): > >= < <=
- [some other predicates](ch4/b/e3.clj): number? string? keyword? map? vector?
- [boolean functions](ch4/b/e4.clj): not and or
#### c. Truthy and Falsy
- [Kind of true, kind of false](ch4/c/e1.clj)
#### d. Do and When
- [grouping forms](ch4/d/e1.clj): do
- [grouping forms in a condition](ch4/d/e2.clj): if-do[-do]
- [grouping forms, only for truthy](ch4/d/e3.clj): when
#### e. Dealing with Multiple Conditions
- [if "else if" "else" is a pain](ch4/e/e1.clj)
- [simplify by cond](ch4/e/e2.clj): cond predicate value
- [the cond :else idiom](ch4/e/e3.clj): cond :else
- [simplified condition](ch4/e/e4.clj): case
#### f. Throwing and Catching
- [Clojure exception](ch4/f/e1.clj): ex-info ExceptionInfo

### Chapter 5 - More Capable Functions
#### a. One Function, Different Parameters
- [multi-arity function](ch5/a/e1.clj)
- [multi-arity function revised](ch5/a/e2.clj): filling in the defaults
#### b. Arguments with Wild Abandon
- [variadic function with rest parameter](ch5/b/e1.clj): & marker
- [accessing an item from a rest parameter](ch5/b/e2.clj)
- [mixing plain and rest parameters](ch5/b/e3.clj)
#### c. Multimethods
- [function behavior based on argument structure](ch5/c/e1.clj): if - "else if" approach
- [simplified approach](ch5/c/e2.clj): defmulti, defmethod
- [dispatch function example](ch5/c/e3.clj)
- [no dispatch function example](ch5/c/e4.clj): dispatch by keyword
#### d. Deeply Recursive
- [plain recursive function (no TCO)](ch5/d/e1.clj)
- [tail call optimization on recursion](ch5/d/e2.clj): recur
- [idiomatic TCO on recursion](ch5/d/e3.clj): loop recur
- [standard functions often make life easier](ch5/d/e4.clj): (apply/map spoiler)
#### e. Docstrings
- [documenting defn, def (and more)](ch5/e/e1.clj)
#### f. Pre- and Post-Conditions
- [precondition the hard way](ch5/f/e1.clj): when-not
- [precondition](ch5/f/e2.clj): {:pre [expressions]}
- [postcondition](ch5/f/e3.clj): {:post [expressions]}
#### g. Staying Out of Trouble
- [variadic in multi-arity](ch5/g/e1.clj)

### Chapter 6 - Functional Things
#### a. Functions Are Values
- [a combiner as higher order function](ch6/a/e1.clj)
#### b. Functions on the Fly
- [anonymous function](ch6/b/e1.clj): fn
- [a closure](ch6/b/e2.clj)
- [another closure](ch6/b/e3.clj)
#### c. A Functional Toolkit
- [call a function on the items of a collection](ch6/c/e1.clj): apply
- [build a function with fewer parameters](ch6/c/e2.clj): partial
- [another example for partial](ch6/c/e3.clj)
- [build a negating function](ch6/c/e4.clj): complement
- [combine predicates and-ing them together](ch6/c/e5.clj): every-pred
#### d. Function Literals
- [minimalistic syntax for anonymous function](ch6/d/e1.clj): #()

### Chapter 7 - Let
#### a. A Local, Temporary Place for Your Stuff
- [local binding](ch7/a/e1.clj): let
#### b. Let Over Fn
- [make the previous example more complex](ch7/b/e1.clj)
- [function factory keeps the complexity under control](ch7/b/e2.clj): let fn
#### c. Variations on the Theme
- [combining if and let together](ch7/c/e1.clj): if-let
- [combining when and let together](ch7/c/e2.clj): when-let
#### d. Staying Out of Trouble
- [let lexical scope](ch7/d/e1.clj)
- [nested let](ch7/d/e2.clj)
- [duplicated let](ch7/d/e3.clj)

### Chapter 8 - Def, Symbols, and Vars
#### a. A Global, Stable Place for Your Stuff
- [globally bind a symbol to a value](ch8/a/e1.clj): def, defn
#### b. Symbols Are Things
- [What is a symbol](ch8/b/e1.clj)
#### c. Bindings Are Things Too
- [What is a var](ch8/c/e1.clj)
#### d. Varying Your Vars
- [vars could vary (but shouldn't)](ch8/d/e1.clj)
- [use dynamic vars (spoiler), only when strictly required](ch8/d/e2.clj): ^:dynamic binding \*earmuff\*
#### e. In the Wild
- [some commonly used standard earmuffs](ch8/e/e1.clj): \*print-length\* \*1 \*e

### Chapter 9 - Namespaces
#### a. A Place for Your Vars
- [create/switch namespace](ch9/a/e1.clj): ns
#### b. Loading Namespaces
- [accessing vars from namespace not already known](ch9/b/e1.clj): require
#### c. A Namespace of Your Own
- [a minimal Clojure app](ch9/c/e1.clj): ns :gen-class
- [each file with its own namespace](ch9/c/e2.clj)
- [requiring while defining a namespace](ch9/c/e3.clj): ns :require
#### d. As and Refer
- [aliasing a required namespace](ch9/d/e1.clj): ns :require :as
- [pulling a var in the current namespace](ch9/d/e2.clj): ns :require :refer
#### e. Namespaces, Symbols, and Keywords
- [getting the current namespace](ch9/e/e1.clj): \*ns\*
- [getting a namespace by name, and its vars](ch9/e/e2.clj): find-ns, ns-map
- [extracting the namespace from symbols and keywords](ch9/e/e3.clj): namespace
