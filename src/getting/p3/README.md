# clj-intro - Introduction to Clojure
Tested on Java 21, Clojure 1.12

# Getting Clojure
Russ Olsen (2018) The Pragmatic Programmer

https://pragprog.com/titles/roclojure/getting-clojure/

## Part 3 - Advanced

### Chapter 16 - Interoperating with Java
#### b. … And Back to Clojure
- [create a Java object, calling its methods](ch16/b/e1.clj): [class-name]. args, .[method] obj  
- [accessing Java object fields](ch16/b/e2.clj): .-[field-name] obj
#### c. Packages
- [import a Java package](ch16/c/e1.clj): import and :import in ns
#### d. Class Methods and Fields
- [static member access](ch16/d/e1.clj): [class-name]/[member-name]
#### e. In the Wild
- [import a Java external dependency](ch16/e/e1.clj): deps.edn

### Chapter 17 - Threads, Promises, and Futures
#### a. Great Power …
- [running threads](ch17/a/e1.clj): Java Thread
#### b. … And Great Responsibility
- [race condition](ch17/b/e1.clj)
#### c. Good Fences Make Happy Threads
- [respect immutability](ch17/c/e1.clj)
- [thread local bindings](ch17/c/e2.clj): dynamic vars ^:dynamic