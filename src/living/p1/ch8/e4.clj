;;; For more info read Living Clojure by Carin Meier
;; template: backtick `, unquote ~
(ns living.p1.ch8.e4)

(def user :Tom)

(defn -main []
  ;; quote: prevent evaluation of symbol/expression
  (println "A list as expression (quote):" '(first [1 2 3]))
  ;; backtick, syntax-quote
  ;; like quote but: resolve namespace and support unquoting (interpolation)
  (println "A list as expression (backtick):" `(first [1 2 3]))

  (let [x 42]
    (println "Quote:" '(first [x 2 3]))
    (println "Backtick:" `(first [x 2 3]))
    (println "Backtick and tilde:" `(first [~x 2 3])))
  )
