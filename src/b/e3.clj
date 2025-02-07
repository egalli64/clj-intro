;;; control flow: _if_ + _do_ expression, and the _when_ expression
;; since _if_ expects two forms, the "then" and "else", _do_ is required to group more forms

(ns b.e3)

(defn -main []
    ;; print what _if_ returns
    (println (if true
        ;; then execute println and return the following form
        (do (println "Truthy") "Returned by if-truthy")
        ;; else execute println and return the following form
        (do (println "Falsey") "Returned by if-falsey")))

    ;; if ... do works fine also without the "else" branch
    (println (if true
        ;; then execute println and return the following form
        (do (println "Truthy") "if-do, no 'else' branch")))

    ;; when is just an alternative syntax for the if ... do without "else"
    (println (when true
        ;; then execute println and return the following form
        (println "Yes!") "in a when there is no room for an 'else'"))
)