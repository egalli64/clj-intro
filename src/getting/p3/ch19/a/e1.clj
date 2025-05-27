;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Getting Clojure by Russ Olsen
;; list or function definition?

'(helvetica times-roman [comic-sans] (futura gil-sans (courier "All the fonts I have loved!")))

'(defn print-greeting [preferred-customer] (if preferred-customer (println "Welcome back!")))

;; remove a quote and you get code!
(defn print-greeting [preferred-customer] (if preferred-customer (println "Welcome back!")))
(print-greeting true)
