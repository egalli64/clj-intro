;;; control flow: _if_ + _do_ expression, and the _when_ expression
;; since _if_ expects two forms, the "then" and "else", _do_ is required to group more forms

(ns brave.p2.ch3.a.e3)

(defn -main []

  ;; print what _if_ returns
  (println (if true
             ;; then execute println and return the following form 
             (do (print "Truthy ... ") "returned by if-truthy")
             ;; else execute println and return the following form
             (do (print "Falsey ... ") "returned by if-falsey")))


  ;; if ... do works fine also without the "else" branch
  ;; but it is perceived as less readable, use _when_ instead
  (println (if true
             ;; then execute println and return the following form
             (do (print "Truthy ... ") "if-do, no 'else' branch")))

    ;; _when_ alternative syntax preferred for the if without "else"
  (println (when true
             ;; then execute println and return the following form
             (println "Yes!") "in a when there is no room for an 'else'")))