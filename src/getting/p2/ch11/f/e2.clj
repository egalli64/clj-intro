;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; slurp doall doseq

(def path "src/getting/p2/ch11/f/")

;; reading the passed file in a string
(slurp (str path "info1.txt"))

(def numbers (iterate inc 1))
(def chapters (take 2 (map slurp (map #(str path "info" % ".txt") numbers))))

;; no file read is done until the seq is realized
(doall chapters)

;; or, to avoid keeping too much information in memory:
(doseq [chapter chapters]
  (println "A chapter:" chapter))
