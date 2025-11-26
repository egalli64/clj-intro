;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; (cond test1 result1 test2 result2 :else default-result)
;; same as if/elseif/elseif/else in other languages

(let [x (- (rand-int (inc 2)) 1)]
  (print "The value is ")
  (cond (< x 0) (println "negative")
        (> x 0) (println "positive")
        :else (println "zero")))
