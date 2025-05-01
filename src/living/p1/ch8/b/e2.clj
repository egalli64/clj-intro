;;; For more info read Living Clojure by Carin Meier
;; defmacro
;;
;; A macro is a function that is evaluated at compile time
;; It receives arguments and manipulates them to generate new code
;; The result is code, that is executed at runtime

(ns living.p1.ch8.b.e2)

(defn hi-queen [phrase] (str phrase ", so please your Majesty."))

;; run in the REPL: (macroexpand-1 '(def-hi-queen alice-hi-queen "My name is Alice"))
;; it will show: (defn alice-hi-queen [] (hi-queen "My name is Alice"))
(defmacro def-hi-queen [name phrase]
  (list 'defn (symbol name) [] (list 'hi-queen phrase)))

;; Cursive can't get that a macro is involved in the process
(def-hi-queen alice-hi-queen "My name is Alice")
(def-hi-queen march-hare-hi-queen "I'm the March Hare")
(def-hi-queen white-rabbit-hi-queen "I'm the White Rabbit")
(def-hi-queen mad-hatter-hi-queen "I'm the Mad Hatter")

(defn -main []
  ;; Cursive can't get that a macro is involved in the process
  (println (alice-hi-queen))
  (println (march-hare-hi-queen))
  (println (white-rabbit-hi-queen))
  (println (mad-hatter-hi-queen)))
