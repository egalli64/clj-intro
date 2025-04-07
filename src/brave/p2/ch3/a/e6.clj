;;; boolean expressions _or_ and _and_
;;
;; they are actually _macro_ since it is expanded to code before execution
;; their nature of macro let them _not_ to evaluate all the arguments if that is not required

(ns brave.p2.ch3.a.e6)

(defn -main []
    ;; _or_ the first truthy is returned
    (println "Or with more truthy arguments:" (or nil false "first truthy is returned" "second truthy is not evaluated"))
    ;; _or_ if are all falsey, the last one is returned
    (println "Or with falsey only arguments:" (or nil false))

    ;; _and_ the first falsey is returned
    (println "And with more falsey arguments:" (and true false nil))
    ;; _and_ if are all truthy, the last one is returned
    (println "And with truthy only arguments:" (and true "" 0))
)
