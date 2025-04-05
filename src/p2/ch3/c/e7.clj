;;; anonymous function (also known as lambda function in other languages)
;;
;; by fn keyword:       (fn [parameters] body)
;; by macro shorthand:  #(body with %)

(ns p2.ch3.c.e7)

(defn -main []
    ;; define and call an anonymous function
    (println "The double of 2 is ..." ((fn [x] (* 2 x)) 2))
    ;; shorthand
    (println "The double of 3 is ..." (#(* 2 %) 3))

    ;; associate an anonymous function to a name ...
    (def double (fn [x] (* 2 x)))
    ;; ... then invoke it through that name
    (println "The double of 4 is ..." (double 4))

    ;; shorthand
    (def double #(* 2 %))
    (println "The double of 5 is ..." (double 5))

    ;; passing an anonymous function to a Higher Order Function
    (def names ["Tom" "Bob" "Joe"])
    (def messages (map #(str "Hi, " % "!") names))
    (println "Names mapped to messages:" messages)

    ;; when more parameters are needed, use %1, %2, ... and %& for more args
    (println (
        #(str "Hi, " %1 ", " %2 " and " %& "!") 
        "Tom" "Bob" "Joe" "Kim"
    ))

    ;; same
    (def hello (
        fn [first second & more] (
            str "Hi, " first ", " second " and " more "!")
    ))(println (hello "Tom" "Bob" "Joe" "Kim"))
)
