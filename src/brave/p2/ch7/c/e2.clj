;;; symbols
;; is it a special form?
;; or, is it a local binding (let)?
;; or, is it a global binding (def /defn)?
;; exception
(ns brave.p2.ch7.c.e2)

;; def for _var_ global binding
(def x 15)

;; defn for _function_ global binding
(defn exclaim [exclamation]
  ;; the parameters are bindings local to the function
  (str exclamation "!"))

(defn -main []
  ;; special form, correct in this context
  (if true :a :b)

  ;; Syntax error compiling: Too few arguments to if
  ;; (if)

  (println "Using a var:" (+ x 3))

  ;; local binding
  (let [x 5]
    (println "Local binding shadows var:" (+ x 3)))

  (println "Invoking a function in the namespace:" (exclaim "Hadoken"))
  
  ;; global functions are symbols in the Clojure core namespace
  (println "Invoking a standard function:" (map inc [1 2 3])))