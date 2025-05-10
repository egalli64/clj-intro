;; clj-intro - Introduction to Clojure
;; https://github.com/egalli64/clj-intro
;;
;; For more info read Living Clojure by Carin Meier
;; Polymorphism: multimethods with custom dispatch function

(defmulti process (fn [height] (if (< height 3) :grow :shrink)))

(defmethod process :grow [_] "Eat the right side to grow.")
(defmethod process :shrink [_] "Eat the left side to shrink.")

;; test the multimethods
(let [values [1 9]]
  (doseq [value values]
    (println (process value))))
