;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; let lexical scope

;; def in the namespace
(def title "This is something")

(defn print-the-title []
  ;; title def is visible from inside this defn
  (println "The title is" title))

;; create a let lexical scope
(let [title "Let's Pretend This Never Happened"]
  ;; the local binding shadows the global one (source of confusion)
  (println "The title is" title)
  ;; calling a defn, it won't see the local binding title
  (print-the-title))
