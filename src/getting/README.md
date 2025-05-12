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
- [map (data structure)](p1/ch3/a/e1.clj): literal syntax {}, hash-map function, get value associated to key
#### b. Keywords
- [keyword as map key](p1/ch3/b/e1.clj)
