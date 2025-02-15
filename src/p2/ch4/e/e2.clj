;;; partial - a way to achieve currying in a simplified way
;;
;; (partial func arg ...) returns a new function that requires only the args not already provided to partial

(ns p2.ch4.e.e2)

;; partial on + providing the first addendum
;; the returned function requires only the second argument
(def add10 (partial + 10))

;; partial on conj - provides the target collection, expects the elements to be added
(def add-missing-elements (partial conj ["water" "earth" "air"]))

;; partial on str - provides the base for concatenation, expect what to concatenate as arguments
(def greet (partial str "Hello, "))

;; same as above but by lambda
(def add11 #(+ 11 %))
(def add-to-xyz #(into ["x" "y" "z"] %&)) ; using into to simplify the code
(def greet! #(str "Hello, " % "!"))

(defn -main []
    ;; providing the second addendum to sum
    (println "passing 2 to the partial add10:" (add10 2))
    (println "passing 2 to the lambda add11:" (add11 2))
    ;; providing extra elements to the basic ones
    (println "passing elements to the conj-ing partial:" (add-missing-elements "unobtainium" "adamantium"))
    (println "passing elements to the into-ing lambda:" (add-to-xyz "unobtainium" "adamantium"))
    ;; providing concatenations to the initial string
    (println "Greeting Bob:" (greet "Bob"))
    (println "Greeting Bob!:" (greet! "Bob"))
)
