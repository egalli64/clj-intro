;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; future: more threads competing on an atom by swap!

;; defining an atom
(def counter (atom 0))
(println "Initial value:" @counter)

;; a function to increase an atom three times
(defn increase-3 [atom] (dotimes [_ 3] (swap! atom inc)))

;; call it sychronously
(increase-3 counter)
(println "After calling the increasing function synchronously, counter is" @counter)
(reset! counter 0)
(println "Reset the counter:" @counter)

;; three threads competing on counter
(let [f1 (future (increase-3 counter)), f2 (future (increase-3 counter)), f3 (future (increase-3 counter))] @f1 @f2 @f3)
(println "After calling the increasing function asynchronously, counter is" @counter)

(reset! counter 0)
(println "Reset the counter:" @counter)

;; using a non-pure function to show swap! could retry excuting it
(defn inc-print [value] (print value) (inc value))

;; a function to increase an atom n times
(defn inc-print-3 [atom] (dotimes [_ 3] (swap! atom inc-print)))

(print "Each duplicated counter means swap! retried the function: ")
(let [f1 (future (inc-print-3 counter)), f2 (future (inc-print-3 counter)), f3 (future (inc-print-3 counter))] @f1 @f2 @f3)

(println "\nCounter is" @counter)
