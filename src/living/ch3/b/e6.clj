;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; future: more threads competing on refs by dosync/commute

;; defining two refs
(def height (ref 3))
(def counter (ref 10))
(println "height and counter:" @height @counter)

;; synchronized version
(defn heigh-inc-sync "if counter is positive increase height" []
  (dosync (when (pos? @counter) (commute counter dec) (commute height #(+ % 24)))))

;; the task
(defn change-defs-2 [] (dotimes [_ 2] (heigh-inc-sync)))

;; three threads competing on defs
(let [f1 (future (change-defs-2)), f2 (future (change-defs-2)), f3 (future (change-defs-2))] @f1 @f2 @f3)

(println "after changes from competing threads (expected: 147 4):" @height @counter)
