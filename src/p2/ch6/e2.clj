;;; def, ns-interns, names collision

(ns p2.ch6.e2)

;; the var names is interned in the current namespace
;; meaning that names is registered in the namespace symbol table
(def names ["Bob" "Tom" "Kim"])

(defn -main []
    ;; use ns-interns to get the intern map in a namespace
    (let [intern-map (ns-interns 'p2.ch6.e2)]
        ;; the function get retrieves the value associated to the symbol on that map
        ;; the var reader form, that gives the reference to the object
        (println "var reader form to 'names':" (get intern-map 'names))
        (println "... if there is not that symbol:" (get intern-map 'missing))
    )

    ;; accessing the object from a var reader form
    (let [vrf (get (ns-interns 'p2.ch6.e2) 'names)]
        (if (not (nil? vrf))
            (println "Dereferencing" vrf "gives:" @vrf)
        )
    )

    ;; same, but in a simplified way
    ;; if a fully qualified namespace is used (my.ns/symbol), is should match, otherwise Clojure looks:
    ;; 1) in the current namespace where the code is _executed_ (local context)
    ;; 2) in the namespace loaded by -m
    ;; 3) in imported namespaces, by require or use
    ;; 4) in default namespace (clojure.core)
    (println "Getting names from the current namespace:" names)

    ;; names collision
    (def names "Something unexpected!")
    (println "What happened to my names?" names)
)
