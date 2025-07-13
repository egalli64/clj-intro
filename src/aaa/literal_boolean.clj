;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;; Boolean

;; the only two boolean literals - actually Java Boolean
(type false)
(type true)

;; only false and nil are considered falsy in Clojure
(if (not (or false nil))
  (println "Only false and nil are falsy!"))

(if (and 0 [] "" :false)
  (println "Everything else is truthy!"))

;; the coercion function boolean generates a boolean from the passed value
;; any value is truthy, coerced to true ...
(boolean 42)
(boolean 0)
(boolean {})
;; ... but nil (and false)
(boolean nil)
(boolean false)
