;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; assoc on vector

;; a vector
(def friends [:al :bob :charlie])
(println "Friends:" friends)

;; change an item in a vector
(def friends-2 (assoc friends 1 :billy))
(println "Modified friends:" friends-2)

;; add a new item in the end (append)
(def friends-3 (assoc friends 3 :dan))
(println "Adding a friend:" friends-3)

;; dissoc is not meant to be used on a vector
;; uncomment next line to get a ClassCastException at runtime
;; (dissoc friends 2)
