;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; *ns*,

(ns getting.p1.ch9.e.e2)

(println "The user ns" (find-ns 'user))
(println "The vars in the user namespace:" (ns-map (find-ns 'user)))
(println "Same (implicit find-ns):" (ns-map 'user))
