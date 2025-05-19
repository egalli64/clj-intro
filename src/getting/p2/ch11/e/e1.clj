;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; lazy-seq

;; making a seq lazy
(def lazy (lazy-seq [1 2 3]))
(type lazy)

;; wrapping the seq in a function makes the difference clear
(defn chatty-vector [] (println "Here we go!") [1 2 3])

;; no println invoked at lazy seq definition time
(def lazy (lazy-seq (chatty-vector)))

;; accessing the first element in the lazy seq requires its partial realization, println must be invoked
(first lazy)
