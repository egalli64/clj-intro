;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; vector to seq

(def titles ["Emma" "Oliver Twist" "Robinson Crusoe"])
(type titles)
(def my-seq (seq titles))
(type my-seq)
(println my-seq)
