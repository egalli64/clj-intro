;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; varying a var is handy, but it should be avoided in production code

;; defining a low-fi version of pi
(def PI 3.14)
;; defining a misleading version of circle area computation
(defn compute-area [diameter] (* PI diameter diameter))

(println "Low precision (and wrong) area computation:" (compute-area 10))

;; improving the pi precision, rebinding the symbol to a new value
(def PI 3.14159)

(println "Improved precision (but still wrong) area computation:" (compute-area 10))

;; fixing the area computation, rebinding the symbol to a new function
(defn compute-area [diameter]
  (let [radius (/ diameter 2)]
    (* PI radius radius)))

(println "Fixed area computation:" (compute-area 10))
