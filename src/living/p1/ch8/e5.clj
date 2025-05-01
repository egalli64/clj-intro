;;; For more info read Living Clojure by Carin Meier
;; defmacro and template

(ns living.p1.ch8.e5)

(defn hi-queen [phrase] (str phrase ", so please your Majesty."))

;; run in the REPL: (macroexpand-1 '(def-hi-queen alice-hi-queen "My name is Alice"))
;; it will show: (defn alice-hi-queen [] (hi-queen "My name is Alice"))
(defmacro def-hi-queen [name phrase]
  `(defn ~(symbol name) [] (hi-queen ~phrase))
  )

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
