;;; For more info read Living Clojure by Carin Meier
;; Java interop: the doto macro

;; chaining calls gets unreadable fast
(def sbuf (.append (.append (StringBuffer. "Who ") "are ") "you?"))
(println (.toString sbuf))

;; chaining with the doto macro
(def sb (doto (StringBuffer. "Who ") (.append "are ") (.append "you?")))
(println (.toString sb))
