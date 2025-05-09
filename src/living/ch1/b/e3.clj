;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Collections

;; What Collections Have in Common

;; a collection
(def data [1 2 3 4])
(println "A collection:" data)

;; each collection can be passed to first, rest, last, nth
(println "First:" (first data))
(println "Rest:" (rest data))
(println "Last:" (last data))
(println "Nth (2):" (nth data 2))

;; and count, conj
(println "Count:" (count data))
(println "Conj:" (conj data 42 43))
(println "Conj on a list:" (conj '(1 2 3 4) 42 43))
