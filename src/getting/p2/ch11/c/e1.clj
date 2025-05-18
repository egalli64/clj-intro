;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; take as lazy function

;; extracting a (large) lazy subseq from an infinite lazy seq
(def xs (take 10000000 (iterate inc 1)))

;; this is easy
(first xs)

;; this takes some times, and then crashes
(try
  (println (nth xs 10000000))
  (catch IndexOutOfBoundsException _ (println "Bad index!")))

;; the seq has been fully realized by the previous call, so this call is fast
(println (nth xs (- 10000000 1)))
