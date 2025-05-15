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
