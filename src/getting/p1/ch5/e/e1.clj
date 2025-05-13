;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; docstring

(ns getting.p1.ch5.e.e1)

;; Commenting is good for documenting ...
(defn average "a docstring is a better form of documentation" [a b]
  (/ (+ a b) 2.0))

;; docstring works on def too (as on macro and record)
(def ISBN-LENGTH "ISBN code length" 13)

;; and on multi-arity functions
(defn multi-average
  "Return the average of 2 or 3 numbers."
  ([a b] (/ (+ a b) 2.0))
  ([a b c] (/ (+ a b c) 3.0)))

(defn -main []
  ;; the doc macro is available in the REPL only (doc average)
  ;; still any good IDE makes use of it for documenting a function
  (println (average 42 99))
  (println ISBN-LENGTH)
  (println (multi-average 42 99))
  (println (multi-average 42 99 12)))
